package milk.telegram.media.message;

import milk.telegram.media.message.type.Contact;
import org.json.JSONObject;

public class ContactMessage extends Message{

    private Contact contact;

    public ContactMessage(JSONObject object){
        super(object);
        this.contact = Contact.create(object.getJSONObject("contact"));
    }

    public Contact getContact(){
        return this.contact;
    }

}
