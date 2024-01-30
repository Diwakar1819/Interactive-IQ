import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;


public class Chatbot {

    public JFrame mainFrame;
    public JFrame chatbotFrame;
    public JTextArea chatbotArea;
    public JTextField userInputField;
    public JButton sendButton;
    public List<Color> chatboxColors; // List of chatbox background colors
    public int colorIndex = 0; // Index to keep track of the current color

    public Chatbot() {
        mainFrame = new JFrame("Chatbot");
        chatbotFrame = new JFrame("Chatbot Interface");

        chatbotArea = new JTextArea();
        chatbotArea.setEditable(false);
        chatbotArea.setLineWrap(true);

        chatbotArea.setForeground(Color.WHITE);

        chatbotArea.setForeground(Color.WHITE);
        // Set the font size for the JTextArea's text
        Font textFont = new Font("Arial", Font.PLAIN, 18); // You can adjust the font size (16 in this example)
        chatbotArea.setFont(textFont);

        userInputField = new JTextField();
        userInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Initialize the list of chatbox background colors
        chatboxColors = new ArrayList<>();
        chatboxColors.add(Color.DARK_GRAY);
        // Add more colors to the list as needed

        JPanel chatbotPanel = new JPanel();
        chatbotPanel.setLayout(new BorderLayout());
        chatbotPanel.add(chatbotArea, BorderLayout.CENTER);
        chatbotPanel.add(userInputField, BorderLayout.SOUTH);
        chatbotPanel.add(sendButton, BorderLayout.EAST);

        chatbotFrame.add(chatbotPanel);
        chatbotFrame.setSize(500, 500);
        chatbotFrame.setLocationRelativeTo(null);
        chatbotFrame.setVisible(false);

        mainFrame.setSize(300, 300);
        mainFrame.setLocationRelativeTo(null);

        JButton openChatbotButton = new JButton("Open Chatbot");
        openChatbotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeChatboxColor(); // Change chatbox color when opening
                chatbotFrame.setVisible(true);
            }
        });

        mainFrame.add(openChatbotButton);
        mainFrame.setVisible(true);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                chatbotFrame.dispose();
                System.exit(0);
            }
        });
    }

    // Change the chatbox background color
    private void changeChatboxColor() {
        if (!chatboxColors.isEmpty()) {
            chatbotArea.setBackground(chatboxColors.get(colorIndex));
            colorIndex = (colorIndex + 1) % chatboxColors.size(); // Cycle through colors
        }
    }

    private void sendMessage() {

        String userInput = userInputField.getText();
        chatbotArea.append(userInput + "\n");
        userInputField.setText("");

        String chatbotResponse;
        switch (userInput) {
            case "hello":
                chatbotResponse = "Hello! How can I help you today?";
                break;
            case "hi":
                chatbotResponse = "Hello! How can I help you today?";
                break;
            case "vanakkam":
                chatbotResponse = "Hello! How can I help you today?";
                break;
            case "how are you?":
                chatbotResponse = "I am fine. What about you?";
                break;
            case "what is the meaning of life?":
                chatbotResponse = "The meaning of life is a question that has been pondered by philosophers for centuries. There is no one answer that will satisfy everyone. However, I believe that the meaning of life is to find your own purpose and to live it to the fullest.";
                break;
            case "can you tell me a joke?":
                chatbotResponse = "Sure. Here is a joke, Oru bus la oru conductor irundharu ah, avuru ellaru kitayum thappu ah nadandhu kitu irundharu yean?(To know the answer type ANSWER)";
                break;
            case "ANSWER":
                chatbotResponse = "Because he was a bad conductor";
                break;
            case "which is the best college in India?":
                chatbotResponse = "chennai institute of technology";
                break;
            case "how many days are there in a week?":
                chatbotResponse = "There are seven days in a week: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday.";
                break;
            case "what is the color of the sky?":
                chatbotResponse = "The color of the sky varies but is often blue during the day and can turn shades of orange, red, or purple during sunrise and sunset.";
                break;
            case "what is the opposite of 'hot'?":
                chatbotResponse = "The opposite of 'hot' is 'cold.'";
                break;
            case "how do you spell 'cat'?":
                chatbotResponse = "C-A-T spells 'cat.'";
                break;
            case "what is the square root of 9?":
                chatbotResponse = "The square root of 9 is 3.";
                break;
            case "what is the largest mammal on Earth?":
                chatbotResponse = "The largest mammal on Earth is the blue whale.";
                break;
            case "what is the main ingredient in bread?":
                chatbotResponse = "The main ingredient in bread is flour, typically made from wheat.";
                break;
            case "what is the primary gas in the Earth's atmosphere?":
                chatbotResponse = "The primary gas in the Earth's atmosphere is nitrogen, which makes up about 78% of the atmosphere.";
                break;
            case "what is the freezing point of water in Fahrenheit?":
                chatbotResponse = "The freezing point of water in Fahrenheit is 32°F.";
                break;
            case "which is the largest planet in our solar system?":
                chatbotResponse = "Jupiter is the largest planet in our solar system.";
                break;
            case "how do i change my wifi password?":
                chatbotResponse = "To change your Wi-Fi password, access your router's settings through a web browser. Typically, you'll need to log in with your router's IP address and admin credentials, then navigate to the security settings to change the password.";
                break;
            case "what is the chemical symbol for water?":
                chatbotResponse = "The chemical symbol for water is H2O.";
                break;
            case "which is the tallest mountain in the world?":
                chatbotResponse = "Mount Everest is the tallest mountain in the world.";
                break;
            case "who is the director of jailer?":
                chatbotResponse = "The director of Jailer is Nelson Dilip
