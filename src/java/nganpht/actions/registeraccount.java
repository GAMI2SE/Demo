/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganpht.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

//@ResultPath(value = "/")
//@Results({
//    @Result (name = "success", location = "success.jsp"),
//    @Result (name = "input", location = "index.jsp")
//})
//@Action(value = "registeraccount", results = {
//    @Result (name = "success", location = "/success.jsp"),
//    @Result (name = "input", location = "/index.jsp")
//})
public class registeraccount extends ActionSupport {
    private String username, password, confirm, emailId, PhoneNo;

    public String getUsername() {
        return username;
    }

    @RequiredStringValidator(message = "Username can't be blank!")
    @StringLengthFieldValidator(type = ValidatorType.FIELD, 
            minLength = "6", maxLength = "20", message = "Username has length from 6 to 20 characters")
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    @Validations(requiredStrings = {
                @RequiredStringValidator(message = "Password can't be blank")},
            stringLengthFields = {
                @StringLengthFieldValidator(type = ValidatorType.FIELD, 
                    minLength = "6", message = "Password can not less than 6")}
    )
    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }
    @FieldExpressionValidator(expression = "confirm==password", 
            message = "Confirm must match Password")
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getEmailId() {
        return emailId;
    }
    @RequiredStringValidator(message = "Email can't be blank")
    @EmailValidator(type = ValidatorType.FIELD, message = "Email Id is invalid")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }
    @RequiredStringValidator(message = "Phone number can't be blank")
    @RegexFieldValidator(type = ValidatorType.FIELD, regex = "\\d{3}-\\d{8}", message = "Phone number is invalid")
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    
    public registeraccount() {
    }
    
    @Override
    public String execute() throws Exception {
        return "success";
    }
    
    @Action(value = "registeraccount", results = {
        @Result (name = "success", location = "/success.jsp"),
        @Result (name = "input", location = "/index.jsp")
    })
    
    public String nganpht() throws Exception {
        System.out.println("aaaaaaaaaaaaaa");
        return "success";
    }
}
