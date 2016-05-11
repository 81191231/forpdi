
import Fluxbone from "forpdi/jsx/core/store/Fluxbone.jsx";
import UserSession from "forpdi/jsx/core/store/UserSession.jsx";


var URL = Fluxbone.BACKEND_URL+"user";

var UserModel = Fluxbone.Model.extend({
	url: URL,
	validate(attrs, options) {
		var errors = [];
		
		if (attrs.name == undefined || attrs.name == "") {
			errors.push("O nome é obrigatório.");
		}
		if (attrs.email == undefined || attrs.email == "") {
			errors.push("O e-mail é obrigatório.");
		}

		if (errors.length > 0)
			return errors;
	}
});

var UserStore = Fluxbone.Store.extend({
	ACTION_SIGNUP: 'user-create',
	ACTION_FIND: 'user-find',
	ACTION_DESTROY: 'user-destroy',
	dispatchAcceptRegex: /^user-[a-zA-Z0-9]+$/,

	url: URL,
	model: UserModel

});

export default new UserStore();
