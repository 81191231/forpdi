package org.forpdi.core.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.forpdi.core.user.authz.AccessLevels;

import br.com.caelum.vraptor.boilerplate.SimpleLogicalDeletableEntity;
import br.com.caelum.vraptor.serialization.SkipSerialization;

/**
 * @author Renato R. R. de Oliveira
 * 
 */
@Entity(name = User.TABLE)
@Table(name = User.TABLE)
public class User extends SimpleLogicalDeletableEntity {
	public static final String TABLE = "fpdi_user";
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, unique=true, length=255)
	private String email;

	@Column(nullable=true, unique=true, length=255)
	private String cpf;

	@Column(nullable=true, unique=true, length=255)
	private String cellphone;

	@Column(nullable=true, length=255)
	@SkipSerialization
	private String password;
	
	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=true, length=255)
	private String phone;

	@Column(nullable=true, length=255)
	private String department;
	
	@Column(nullable=true, length=255)
	private String picture;

	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date birthdate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date creation = new Date();
	
	@Column(nullable=true, length=128, unique=true)
	private String inviteToken;

	private boolean active = false;
	private int accessLevel = AccessLevels.NONE.getLevel();
	
	@Transient
	private boolean blocked = false;
	
	@Transient
	private int notificationSettings;
	
	public int getNotificationSettings() {
		return notificationSettings;
	}

	public void setNotificationSettings(int notificationSettings) {
		this.notificationSettings = notificationSettings;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getInviteToken() {
		return inviteToken;
	}

	public void setInviteToken(String inviteToken) {
		this.inviteToken = inviteToken;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", cpf=" + cpf + ", cellphone=" + cellphone + ", password=" + password
				+ ", name=" + name + ", phone=" + phone + ", department=" + department + ", picture=" + picture
				+ ", birthdate=" + birthdate + ", creation=" + creation + ", inviteToken=" + inviteToken + ", active="
				+ active + ", accessLevel=" + accessLevel + ", blocked=" + blocked + ", notificationSettings="
				+ notificationSettings + "]";
	}

	
	
	
	
}
