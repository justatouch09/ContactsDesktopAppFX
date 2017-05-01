package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phoneNumber;

    @FXML
    TextField email;

    //EVENT HANDLERS
    public void addContact() {
        contacts.add(new Contact(name.getText(), phoneNumber.getText(), email.getText()));
        name.setText(""); phoneNumber.setText(""); email.setText("");
    }

    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    //METHOD TO RUN ON APP START
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}
