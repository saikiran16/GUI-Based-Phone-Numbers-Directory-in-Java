/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_gui;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author  Saikiran Jaddu
 */


class Phone_numbers extends JFrame  implements ActionListener 
{
    JButton addButton,searchButton,deleteButton;
    
    
    Phone_numbers() 
    {
        setVisible(true);
        setTitle("PHONE BOOK");
        setLayout(null);
        setBounds(0,0,5000,5000);
        setLayout(null);
        
        //setSize(500,500);
        
        Container cp = getContentPane();
        cp.setBackground(new Color(153,153,153));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding Welcome
        JLabel welcome = new JLabel("Welcome");
        Font myFont_welcome = new Font("Monospaced",Font.BOLD,46);
        welcome.setFont(myFont_welcome);
        welcome.setBounds(840,-100,300,300);
        welcome.setVisible(true);
        add(welcome);
        
        //Adding Description
        String des = "This is a Phone Directory . Click the respective button";
        JLabel description = new JLabel(des);
        description.setVisible(true);
        description.setBounds(100,200,850,100);
        add(description);
        Font myFont_description = new Font("Tempus Sans ITC",Font.BOLD,30);
        description.setFont(myFont_description);
        
        // Adding Add Label
        JLabel addLabel =  new JLabel("Click Here to add a Contact");
        Font myFont_add = new Font("Viner Hand ITC",Font.BOLD,25);
        addLabel.setFont(myFont_add);
        addLabel.setBounds(250, 350, 400, 100);
        addLabel.setVisible(true);
        add(addLabel);
        
        // Adding Add Button
        ImageIcon addIcon = new ImageIcon("D:\\Saikiran\\B.tech_ 2_1\\Object_Oreinted_Programming\\add96pixels.png");
        addButton = new JButton(addIcon);
        addButton.setVisible(true);
        addButton.setBounds(850,350,200,80);
        add(addButton);
        
        // Adding Search Label
        JLabel searchLabel =  new JLabel("Click Here to Search a Contact");
        Font myFont_search = new Font("Viner Hand ITC",Font.BOLD,25);
        searchLabel.setFont(myFont_search);
        searchLabel.setBounds(250, 550, 550, 100);
        searchLabel.setVisible(true);
        add(searchLabel);
        
        
        
        // Adding Search Button
        ImageIcon searchIcon = new ImageIcon("D:\\Saikiran\\B.tech_ 2_1\\Object_Oreinted_Programming\\search128pixels.png");
        searchButton = new JButton(searchIcon);
        searchButton.setVisible(true);
        searchButton.setBounds(850,550,200,80);
        add(searchButton);
        
        
       // Adding Delete  Label
        JLabel deletelabel=  new JLabel("Click Here to Delete a Contact");
        Font myFont_delete = new Font("Viner Hand ITC",Font.BOLD,25);
        deletelabel.setFont(myFont_delete);
        deletelabel.setBounds(250,750, 550, 100);
        deletelabel.setVisible(true);
        add(deletelabel);
        
        
        // Adding Delete Button
        ImageIcon deleteIcon = new ImageIcon("D:\\Saikiran\\B.tech_ 2_1\\Object_Oreinted_Programming\\delete96pixels.png");
        deleteButton = new JButton(deleteIcon);
        deleteButton.setVisible(true);
        deleteButton.setBounds(850,750,200,80);
        add(deleteButton);
        addButton.addActionListener(this);
        searchButton.addActionListener(this);
        deleteButton.addActionListener(this);
        
    }
    
    public static void main(String[] args)  {
        Phone_numbers obj = new Phone_numbers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton)
        {
            AddNewContact newcontact = new AddNewContact();
        }
        else if(e.getSource() == searchButton)
        {
            SearchContact searchcontact = new SearchContact();
        }
        else
        {
            DeleteContact deletecontact = new DeleteContact();
        }
    }
    
}
class AddNewContact extends JFrame implements ActionListener
{
    JTextField nameField,numberField;
    JLabel success,nameOfPerson,numberOfPerson;
    JButton clearButton,saveButton;
    int  i = 0;
    AddNewContact()  
    {
        setVisible(true);
        setLayout(null);

        setBounds(0,0,1000,1000);
        Container cp = getContentPane();
        cp.setBackground(new Color(250,160,122));
        //JPanel jp = new JPanel();
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Addibg New Contact Label
        JLabel newcontactLabel = new JLabel("New Contact");
        Font myFont_newcontactfont = new Font("Old English Text MT",Font.BOLD,40);
        newcontactLabel.setFont(myFont_newcontactfont);
        newcontactLabel.setBounds(370,0,250,200);
        newcontactLabel.setVisible(true);
        add(newcontactLabel);
        
        // Adding Description -- Enter Name and number
        
        JLabel DescriptionLabel = new JLabel("Enter Name Of the Person and Enter Phone Number,Then Click Save..");
        Font myFont_Description = new Font("Old English Text MT",Font.BOLD,24);
        DescriptionLabel.setFont(myFont_Description);
        DescriptionLabel.setBounds(0,200,900,100);
        DescriptionLabel.setVisible(true);
        add(DescriptionLabel);
        
        
        // Adding name label
        
         nameOfPerson = new JLabel("Name Of the person : ");
        Font myFont_nameOfPerson = new Font("Chiller",Font.BOLD,30);
        nameOfPerson.setFont(myFont_nameOfPerson);
        nameOfPerson.setBounds(100,400,700,100);
        nameOfPerson.setVisible(true);
        add(nameOfPerson);
        
        //Adding Name TextField
        
         nameField = new JTextField(30);
        Font myFont_nameField = new Font("PMingLiU-ExtB",Font.BOLD,25);
        nameField.setFont(myFont_nameField);
        nameField.setVisible(true);
        nameField.setBounds(380,440,400,40);
        add(nameField);
        
        // Adding Phone Number Label of Person
         numberOfPerson = new JLabel("Phone Number  : ");
        Font myFont_numberOfPerson = new Font("Chiller",Font.BOLD,30);
        numberOfPerson.setFont(myFont_numberOfPerson);
        numberOfPerson.setBounds(100,500,700,100);
        numberOfPerson.setVisible(true);
        add(numberOfPerson);
        
        
        //Adding Number TextField
        
        numberField = new JTextField(30);
        Font myFont_numberField = new Font("PMingLiU-ExtB",Font.BOLD,25);
        numberField.setFont(myFont_numberField);
        numberField.setVisible(true);
        numberField.setBounds(380,540,400,40);
        add(numberField);
        
        
        // Adding Save Button
        
        saveButton = new JButton("Save");
        saveButton.setVisible(true);
        saveButton.setBounds(520,640,100,40);
        add(saveButton);
        
        saveButton.addActionListener(this);
        
         clearButton = new JButton("clear");
        clearButton.setVisible(true);
        clearButton.setBounds(650,640,100,40);
        add(clearButton);
        clearButton.addActionListener(this);
        
        success = new JLabel("result");
            success.setVisible(true);
            success.setBounds(520,700,100,60);
            this.add(success);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == clearButton)
        {
            nameField.setText("");
            numberField.setText("");
            success.setText("");
        }
        else{
       
            String s = nameField.getText().toString();
            long num = new Long(numberField.getText());
            StoringListOfContacts add_contacts = StoringListOfContacts.getInstance();
            s = add_contacts.addcontact(s,num);
            success.setText(s);
        }
        
        
 }
}
class SearchContact extends JFrame implements ActionListener
{
    JTextField nameField,numberField;
    JLabel searchcontactLabel,nameOfPerson,numberLabel;
    JButton clearButton,searchButton;
    SearchContact()   
    {
        setVisible(true);
        setBounds(200,200,900,800);
        Container cp = getContentPane();
        setLayout(null);

        cp.setBackground(new Color(176,224,230));
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding Search Contact Label
        searchcontactLabel = new JLabel("Search Contact");
        Font myFont_searchfont = new Font("Old English Text MT",Font.BOLD,46);
        searchcontactLabel.setFont(myFont_searchfont);
        searchcontactLabel.setBounds(290,0,500,200);
        searchcontactLabel.setVisible(true);
        add(searchcontactLabel);
        
        JLabel DescriptionLabel = new JLabel("Enter Name Of the Person To search and click search Button");
        Font myFont_Description = new Font("Old English Text MT",Font.BOLD,24);
        DescriptionLabel.setFont(myFont_Description);
        DescriptionLabel.setBounds(0,200,900,100);
        DescriptionLabel.setVisible(true);
        add(DescriptionLabel);
        
        
      
        // Adding Search label
        
         nameOfPerson = new JLabel("Name Of the person : ");
        Font myFont_nameOfPerson = new Font("Chiller",Font.BOLD,30);
        nameOfPerson.setFont(myFont_nameOfPerson);
        nameOfPerson.setBounds(100,400,700,100);
        nameOfPerson.setVisible(true);
        add(nameOfPerson);
        
        //Adding Search TextField
        
        nameField = new JTextField(30);
        Font myFont_nameField = new Font("PMingLiU-ExtB",Font.BOLD,25);
        nameField.setFont(myFont_nameField);
        nameField.setVisible(true);
        nameField.setBounds(380,440,400,40);
        add(nameField);
        
        
         numberLabel = new JLabel("Name Of the person : ");
        Font myFont_numberLabel = new Font("Chiller",Font.BOLD,30);
        numberLabel.setFont(myFont_numberLabel);
        numberLabel.setBounds(100,600,700,100);
        numberLabel.setVisible(true);
        add(numberLabel);
        // Adding Search Button
        searchButton = new JButton("Search");
        searchButton.setVisible(true);
        searchButton.setBounds(520,540,100,40);
        add(searchButton);
        searchButton.addActionListener(this);
        
        clearButton = new JButton("clear");
        clearButton.setVisible(true);
        clearButton.setBounds(650,540,100,40);
        add(clearButton);
        clearButton.addActionListener(this);
        
        numberField = new JTextField(30);
        Font myFont_number = new Font("PMingLiU-ExtB",Font.BOLD,25);
        numberField.setFont(myFont_number);
        numberField.setVisible(true);
        numberField.setBounds(380,640,400,40);
        add(numberField);
        
        
        
}

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == clearButton)
            {
                nameField.setText("");
                numberField.setText("");
                
            }
            else
            {
            StoringListOfContacts search_contacts = StoringListOfContacts.getInstance();
            String s = nameField.getText().toString();
            System.out.println(s);
            try{
            s = search_contacts.searchcontact(s);
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
            numberField.setText(s);
            }
        
    }
}
class DeleteContact extends JFrame implements ActionListener
{
    JTextField nameField;
    JButton clearButton,deleteButton;
    JLabel result;
    DeleteContact()    
    {
        setVisible(true);
        setBounds(200,200,900,800);
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(new Color(255,228,196));
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel deletecontactLabel = new JLabel("Delete Contact");
        Font myFont_newcontactfont = new Font("Old English Text MT",Font.BOLD,46);
        deletecontactLabel.setFont(myFont_newcontactfont);
        deletecontactLabel.setBounds(290,0,500,200);
        deletecontactLabel.setVisible(true);
        add(deletecontactLabel);
        
        // Adding Search label
        
        JLabel nameOfPerson = new JLabel("Name Of the person : ");
        Font myFont_nameOfPerson = new Font("Chiller",Font.BOLD,30);
        nameOfPerson.setFont(myFont_nameOfPerson);
        nameOfPerson.setBounds(100,320,700,100);
        nameOfPerson.setVisible(true);
        add(nameOfPerson);
        
        //Adding Search TextField
        
        nameField = new JTextField(30);
        Font myFont_nameField = new Font("PMingLiU-ExtB",Font.BOLD,25);
        nameField.setFont(myFont_nameField);
        nameField.setVisible(true);
        nameField.setBounds(380,350,400,40);
        add(nameField);
        
        // Adding Search Button
        deleteButton = new JButton("Delete");
        deleteButton.setVisible(true);
        deleteButton.setBounds(520,450,100,40);
        add(deleteButton);
        deleteButton.addActionListener(this);
        //Adding clear Button
        clearButton = new JButton("clear");
        clearButton.setVisible(true);
        clearButton.setBounds(650,450,100,40);
        add(clearButton);
        clearButton.addActionListener(this);
        
        result = new JLabel("result");
        Font myFont_result = new Font("PMingLiU-ExtB",Font.BOLD,25);
        result.setFont(myFont_result);
        result.setVisible(true);
        result.setBounds(380,640,400,40);
        add(result);

    }
    public void actionPerformed(ActionEvent e) {
                  
        if(e.getSource()==clearButton)
        {
            nameField.setText("");
            result.setText("");
        }
        else
        {
            
         String s = nameField.getText().toString();
           StoringListOfContacts delete_contacts = StoringListOfContacts.getInstance();
         s = delete_contacts.deletecontact(s);
         result.setText(s);
        }
      
    }
}

 class StoringListOfContacts
{
     static HashMap<String,Long> contacts;
      private static StoringListOfContacts obj = null;
    private StoringListOfContacts()
     {
       
     }
   public static StoringListOfContacts getInstance() 
    { 
        if (obj == null) 
        {
            contacts = new HashMap<>();
            obj= new StoringListOfContacts();
        }
  
        return obj; 
    } 
   static String addcontact(String name,long number)
    {
        System.out.println(contacts);
        if(contacts.containsKey(name)&&contacts.containsValue(number))
        {
          
          return "Contact Already Exists ";
        }
        else if(contacts.containsKey(name)&&(!contacts.containsValue(number)))
        {
            return "This name is assigned to another Contact . Try Differnt One";
        }
        else if(!contacts.containsKey(name)&&(contacts.containsValue(number)))
        {
            return "This is Already Saved With another Name";
        }
        else
        {
            contacts.put(name, number);
            return "Contact Saved SuccessFull!!";
        }
        
        
    }
    
    static String searchcontact(String name)
    {
        if(contacts.containsKey(name))
        {
            return Long.toString(contacts.get(name));
        }
        else
        {
            return "Contact Not Found";
        }
        
    }
    static String deletecontact(String name)
    {
        
        if(!contacts.containsKey(name))
        {
           
            return "Contact Not found";
        }
        else
        {
          
            contacts.remove(name);
            
            return "Contact Removed Successfully!!";
        }
        
    }
    

}

