import React from "react";

import BudgetStore from "forpdi/jsx/planning/store/Budget.jsx";

export default React.createClass({

	getInitialState() {
		return {
			budgets	: []
		};
	},

	componentDidMount(){
		this.value = this.props.defaultValue || "";		
		BudgetStore.on("budgetRetrivied", (model) => {	
			if (this.isMounted()) {		
			    this.setState({
			    	budgets: model.data
			    });	 
		    } 	
	  	});
	  	BudgetStore.dispatch({
        	action: BudgetStore.ACTION_GET_BUDGET_SIMULATION,        
      	});
	},

	componentWillReceiveProps(newProps){		
		BudgetStore.dispatch({
        	action: BudgetStore.ACTION_GET_BUDGET_SIMULATION,        
      	});
	},

	componentWillUnmount() {
		BudgetStore.off(null, null, this);
	},

	onChange(){
		var idx = this.refs['subaction-select'].value;
		if(idx >= 0){
			this.value = this.state.budgets[idx].subAction;		
		} else {
			this.value = "";
		}
	},

	render(){
		return(
			<div className={this.props.className}>
				<select ref="subaction-select" onChange={this.onChange} className="subAction-select-box" defaultValue={this.value}>
					<option value={-1} key="opt-0" data-placement="right" title="Selecione">Selecione</option>
					{this.state.budgets.map( (budget,idx) => {
						return(
							<option value={idx} key={"opt-"+idx} data-placement="right" title={budget.subAction}>
								{budget.subAction}
							</option>
						);
					})}
				</select>
			</div>
		);
	}
});