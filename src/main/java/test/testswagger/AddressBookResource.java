package test.testswagger;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class AddressBookResource {

    ConcurrentMap<String, UserContact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public UserContact getContact(@PathVariable String id) {
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<UserContact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @PostMapping("/")
    public UserContact addContact(@RequestBody UserContact userContact) {
        contacts.put(userContact.getId(), userContact);
        return userContact;
    }

}