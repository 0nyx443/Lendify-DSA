package project;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Lendify");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        // Layout 
        setLayout(new BorderLayout());

        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(230, 230, 250));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));

        
        JLabel welcomeLabel = new JLabel("Welcome");
        JLabel usernameLabel = new JLabel("Username");
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        sidebar.add(Box.createRigidArea(new Dimension(0, 20)));
        sidebar.add(welcomeLabel);
        sidebar.add(usernameLabel);
        sidebar.add(Box.createRigidArea(new Dimension(0, 40)));

        
        String[] menuItems = {"Dashboard", "Profile", "Payment", "Settings"};
        for (String item : menuItems) {
            JButton button = new JButton(item);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(button);
            sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        sidebar.add(Box.createVerticalGlue());
        JLabel creditsLabel = new JLabel("<html><center>Credits:<br>Taneda<br>Fetalino<br>Gamos<br>Reyes</center></html>");
        creditsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.add(creditsLabel);

        
        // Top Panel
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel userIcon = new JLabel("\uD83D\uDC64"); // Simple user icon
        JLabel usernameTop = new JLabel("Username");
        JButton homeButton = new JButton("Home");

        topPanel.add(userIcon);
        topPanel.add(usernameTop);
        topPanel.add(homeButton);

        
        // Main Dashboard Panel
        JPanel dashboard = new JPanel();
        dashboard.setLayout(new GridLayout(2, 3, 20, 20));
        dashboard.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        String[] dashboardItems = {"Lender", "Borrow", "Status", "Manage Money", "Manage Borrowers", "Credit Score"};
        for (String item : dashboardItems) {
            JButton button = new JButton(item);
            dashboard.add(button);
        }

        add(sidebar, BorderLayout.WEST);
        add(topPanel, BorderLayout.NORTH);
        add(dashboard, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        });
    }
}
