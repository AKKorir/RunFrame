package controllers;
import javax.inject.Inject;
import models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.mvc.*;



private final Form<Contact> contactForm;
private MessagesApi messageApi;
private FormFactory formFactory;

final Logger logger= LoggerFactory.getLogger(this.getClass());

@Inject
public ContactController(FormFactory formFactory, MessagesApi messageApi){
    this.contactForm = formFactory.form(Contact.class);

    this.messageApi = messageApi;
    this.formFactory= formFactory;
}
public Result create (Http.Request request){
    List<String> contactList;
    adminForm.find.query().select("name").orderBy()



            ,request, messageApi. preferred(request)
}

public class ContactController {


}
