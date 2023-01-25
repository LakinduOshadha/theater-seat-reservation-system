package lk.jfn.uoj.eng.ec5080;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 * Dashboard page for seat reservation
 * 
 * @author ARACHCHI K.A.L.O.K 2018/E/007
 */
public class Dashboard extends javax.swing.JFrame {

    static void main(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    // Initializing globle static variables
    private static ArrayList<javax.swing.JButton>
            selectedSeats = new ArrayList();    // to store selected seats
    private static ArrayList<javax.swing.JButton>
            bookedSeats = new ArrayList();  // to store booked seats
    private static int ticketCount = 0; // To store ticket count
    private static final int totalSeatsCount = 84;    // to store total seats count
    private static String seatsStr = null;  // to sotore selected seats in
                                                //String format
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        // to make the window at the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width/2,
                dim.height/2 - this.getSize().height/2);
    }
    /**
     * Creates Dashboard with confirmation page data
     * 
     * @param isConfirmed is booking confirmed
     */
    public Dashboard(boolean isConfirmed) {
        bookSeats(); // Booking relavent seats
    }
    

    /**
     * initComponents() initialize the components in the frame
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        movie = new javax.swing.JLabel();
        seats = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        tickets = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        bookNowButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        E9 = new javax.swing.JButton();
        E10 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        G10 = new javax.swing.JButton();
        G9 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H10 = new javax.swing.JButton();
        H9 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        I10 = new javax.swing.JButton();
        I9 = new javax.swing.JButton();
        I8 = new javax.swing.JButton();
        I7 = new javax.swing.JButton();
        I6 = new javax.swing.JButton();
        I5 = new javax.swing.JButton();
        I4 = new javax.swing.JButton();
        I3 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Reservation System");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setName("Dashboard"); // NOI18N
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("MOVIE");

        jLabel14.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("TIME ");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("TOTAL");

        jLabel16.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("SEATS");

        jLabel17.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("TICKETS");

        jLabel18.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText(":");

        jLabel19.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText(":");

        jLabel20.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText(":");

        jLabel21.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText(":");

        jLabel22.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText(":");

        movie.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        movie.setForeground(new java.awt.Color(51, 51, 51));
        movie.setText("Avengers");

        seats.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        seats.setForeground(new java.awt.Color(51, 51, 51));
        seats.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        time.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(51, 51, 51));
        time.setText("July 08, 21:00");

        tickets.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        tickets.setForeground(new java.awt.Color(51, 51, 51));

        total.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(51, 51, 51));

        errorMessage.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));

        bookNowButton.setBackground(new java.awt.Color(0, 0, 0));
        bookNowButton.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        bookNowButton.setForeground(new java.awt.Color(255, 255, 255));
        bookNowButton.setText("BOOK NOW");
        bookNowButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        bookNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Sold");

        jLabel24.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Selected");

        jLabel25.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Available");

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tickets)
                                    .addComponent(total)
                                    .addComponent(seats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movie)
                                    .addComponent(time)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(movie))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tickets))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage)
                .addGap(38, 38, 38)
                .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("   MOVIE RESERVATION SYSTEM  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 164, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("SCREEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("A");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("B");

        jLabel5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("C");

        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("D");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("E");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("F");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("G");

        jLabel10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("H");

        jLabel11.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("I");

        jLabel12.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("J");

        A1.setBackground(java.awt.Color.darkGray);
        A1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setText("1");
        A1.setBorder(new javax.swing.border.MatteBorder(null));
        A1.setName("A1"); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(java.awt.Color.darkGray);
        A2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setText("2");
        A2.setBorder(new javax.swing.border.MatteBorder(null));
        A2.setName("A2"); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(java.awt.Color.darkGray);
        A3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A3.setForeground(new java.awt.Color(255, 255, 255));
        A3.setText("3");
        A3.setBorder(new javax.swing.border.MatteBorder(null));
        A3.setName("A3"); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(java.awt.Color.darkGray);
        A4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A4.setForeground(new java.awt.Color(255, 255, 255));
        A4.setText("4");
        A4.setBorder(new javax.swing.border.MatteBorder(null));
        A4.setName("A4"); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setBackground(java.awt.Color.darkGray);
        A5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A5.setForeground(new java.awt.Color(255, 255, 255));
        A5.setText("5");
        A5.setBorder(new javax.swing.border.MatteBorder(null));
        A5.setName("A5"); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(java.awt.Color.darkGray);
        A6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A6.setForeground(new java.awt.Color(255, 255, 255));
        A6.setText("6");
        A6.setBorder(new javax.swing.border.MatteBorder(null));
        A6.setName("A6"); // NOI18N
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A7.setBackground(java.awt.Color.darkGray);
        A7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A7.setForeground(new java.awt.Color(255, 255, 255));
        A7.setText("7");
        A7.setBorder(new javax.swing.border.MatteBorder(null));
        A7.setName("A7"); // NOI18N
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        A8.setBackground(java.awt.Color.darkGray);
        A8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A8.setForeground(new java.awt.Color(255, 255, 255));
        A8.setText("8");
        A8.setBorder(new javax.swing.border.MatteBorder(null));
        A8.setName("A8"); // NOI18N
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A9.setBackground(java.awt.Color.darkGray);
        A9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A9.setForeground(new java.awt.Color(255, 255, 255));
        A9.setText("9");
        A9.setBorder(new javax.swing.border.MatteBorder(null));
        A9.setName("A9"); // NOI18N
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A10.setBackground(java.awt.Color.darkGray);
        A10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        A10.setForeground(new java.awt.Color(255, 255, 255));
        A10.setText("10");
        A10.setBorder(new javax.swing.border.MatteBorder(null));
        A10.setName("A10"); // NOI18N
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        B1.setBackground(java.awt.Color.darkGray);
        B1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("1");
        B1.setBorder(new javax.swing.border.MatteBorder(null));
        B1.setName("B1"); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(java.awt.Color.darkGray);
        B2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("2");
        B2.setBorder(new javax.swing.border.MatteBorder(null));
        B2.setName("B2"); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(java.awt.Color.darkGray);
        B3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("3");
        B3.setBorder(new javax.swing.border.MatteBorder(null));
        B3.setName("B3"); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(java.awt.Color.darkGray);
        B4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("4");
        B4.setBorder(new javax.swing.border.MatteBorder(null));
        B4.setName("B4"); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(java.awt.Color.darkGray);
        B5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("5");
        B5.setBorder(new javax.swing.border.MatteBorder(null));
        B5.setName("B5"); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(java.awt.Color.darkGray);
        B6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("6");
        B6.setBorder(new javax.swing.border.MatteBorder(null));
        B6.setName("B6"); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(java.awt.Color.darkGray);
        B7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("7");
        B7.setBorder(new javax.swing.border.MatteBorder(null));
        B7.setName("B7"); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(java.awt.Color.darkGray);
        B8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("8");
        B8.setBorder(new javax.swing.border.MatteBorder(null));
        B8.setName("B8"); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(java.awt.Color.darkGray);
        B9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("9");
        B9.setBorder(new javax.swing.border.MatteBorder(null));
        B9.setName("B9"); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B10.setBackground(java.awt.Color.darkGray);
        B10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        B10.setForeground(new java.awt.Color(255, 255, 255));
        B10.setText("10");
        B10.setBorder(new javax.swing.border.MatteBorder(null));
        B10.setName("B10"); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        D1.setBackground(java.awt.Color.darkGray);
        D1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D1.setForeground(new java.awt.Color(255, 255, 255));
        D1.setText("1");
        D1.setBorder(new javax.swing.border.MatteBorder(null));
        D1.setName("D1"); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setBackground(java.awt.Color.darkGray);
        D2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D2.setForeground(new java.awt.Color(255, 255, 255));
        D2.setText("2");
        D2.setBorder(new javax.swing.border.MatteBorder(null));
        D2.setName("D2"); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D3.setBackground(java.awt.Color.darkGray);
        D3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D3.setForeground(new java.awt.Color(255, 255, 255));
        D3.setText("3");
        D3.setBorder(new javax.swing.border.MatteBorder(null));
        D3.setName("D3"); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        D4.setBackground(java.awt.Color.darkGray);
        D4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D4.setForeground(new java.awt.Color(255, 255, 255));
        D4.setText("4");
        D4.setBorder(new javax.swing.border.MatteBorder(null));
        D4.setName("D4"); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D5.setBackground(java.awt.Color.darkGray);
        D5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D5.setForeground(new java.awt.Color(255, 255, 255));
        D5.setText("5");
        D5.setBorder(new javax.swing.border.MatteBorder(null));
        D5.setName("D5"); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D6.setBackground(java.awt.Color.darkGray);
        D6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D6.setForeground(new java.awt.Color(255, 255, 255));
        D6.setText("6");
        D6.setBorder(new javax.swing.border.MatteBorder(null));
        D6.setName("D6"); // NOI18N
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D7.setBackground(java.awt.Color.darkGray);
        D7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D7.setForeground(new java.awt.Color(255, 255, 255));
        D7.setText("7");
        D7.setBorder(new javax.swing.border.MatteBorder(null));
        D7.setName("D7"); // NOI18N
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D8.setBackground(java.awt.Color.darkGray);
        D8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        D8.setForeground(new java.awt.Color(255, 255, 255));
        D8.setText("8");
        D8.setBorder(new javax.swing.border.MatteBorder(null));
        D8.setName("D8"); // NOI18N
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        E1.setBackground(java.awt.Color.darkGray);
        E1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 255, 255));
        E1.setText("1");
        E1.setBorder(new javax.swing.border.MatteBorder(null));
        E1.setName("E1"); // NOI18N
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setBackground(java.awt.Color.darkGray);
        E2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 255, 255));
        E2.setText("2");
        E2.setBorder(new javax.swing.border.MatteBorder(null));
        E2.setName("E2"); // NOI18N
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setBackground(java.awt.Color.darkGray);
        E3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E3.setForeground(new java.awt.Color(255, 255, 255));
        E3.setText("3");
        E3.setBorder(new javax.swing.border.MatteBorder(null));
        E3.setName("E3"); // NOI18N
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setBackground(java.awt.Color.darkGray);
        E4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E4.setForeground(new java.awt.Color(255, 255, 255));
        E4.setText("4");
        E4.setBorder(new javax.swing.border.MatteBorder(null));
        E4.setName("E4"); // NOI18N
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E5.setBackground(java.awt.Color.darkGray);
        E5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E5.setForeground(new java.awt.Color(255, 255, 255));
        E5.setText("5");
        E5.setBorder(new javax.swing.border.MatteBorder(null));
        E5.setName("E5"); // NOI18N
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E6.setBackground(java.awt.Color.darkGray);
        E6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E6.setForeground(new java.awt.Color(255, 255, 255));
        E6.setText("6");
        E6.setBorder(new javax.swing.border.MatteBorder(null));
        E6.setName("E6"); // NOI18N
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E7.setBackground(java.awt.Color.darkGray);
        E7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E7.setForeground(new java.awt.Color(255, 255, 255));
        E7.setText("7");
        E7.setBorder(new javax.swing.border.MatteBorder(null));
        E7.setName("E7"); // NOI18N
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        E8.setBackground(java.awt.Color.darkGray);
        E8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E8.setForeground(new java.awt.Color(255, 255, 255));
        E8.setText("8");
        E8.setBorder(new javax.swing.border.MatteBorder(null));
        E8.setName("E8"); // NOI18N
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        E9.setBackground(java.awt.Color.darkGray);
        E9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E9.setForeground(new java.awt.Color(255, 255, 255));
        E9.setText("9");
        E9.setBorder(new javax.swing.border.MatteBorder(null));
        E9.setName("E9"); // NOI18N
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        E10.setBackground(java.awt.Color.darkGray);
        E10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        E10.setForeground(new java.awt.Color(255, 255, 255));
        E10.setText("10");
        E10.setBorder(new javax.swing.border.MatteBorder(null));
        E10.setName("E10"); // NOI18N
        E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E10ActionPerformed(evt);
            }
        });

        F1.setBackground(java.awt.Color.darkGray);
        F1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F1.setForeground(new java.awt.Color(255, 255, 255));
        F1.setText("1");
        F1.setBorder(new javax.swing.border.MatteBorder(null));
        F1.setName("F1"); // NOI18N
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setBackground(java.awt.Color.darkGray);
        F2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F2.setForeground(new java.awt.Color(255, 255, 255));
        F2.setText("2");
        F2.setBorder(new javax.swing.border.MatteBorder(null));
        F2.setName("F2"); // NOI18N
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.setBackground(java.awt.Color.darkGray);
        F3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F3.setForeground(new java.awt.Color(255, 255, 255));
        F3.setText("3");
        F3.setBorder(new javax.swing.border.MatteBorder(null));
        F3.setName("F3"); // NOI18N
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.setBackground(java.awt.Color.darkGray);
        F4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F4.setForeground(new java.awt.Color(255, 255, 255));
        F4.setText("4");
        F4.setBorder(new javax.swing.border.MatteBorder(null));
        F4.setName("F4"); // NOI18N
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F5.setBackground(java.awt.Color.darkGray);
        F5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F5.setForeground(new java.awt.Color(255, 255, 255));
        F5.setText("5");
        F5.setBorder(new javax.swing.border.MatteBorder(null));
        F5.setName("F5"); // NOI18N
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        F6.setBackground(java.awt.Color.darkGray);
        F6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F6.setForeground(new java.awt.Color(255, 255, 255));
        F6.setText("6");
        F6.setBorder(new javax.swing.border.MatteBorder(null));
        F6.setName("F6"); // NOI18N
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        F7.setBackground(java.awt.Color.darkGray);
        F7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F7.setForeground(new java.awt.Color(255, 255, 255));
        F7.setText("7");
        F7.setBorder(new javax.swing.border.MatteBorder(null));
        F7.setName("F7"); // NOI18N
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        F8.setBackground(java.awt.Color.darkGray);
        F8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F8.setForeground(new java.awt.Color(255, 255, 255));
        F8.setText("8");
        F8.setBorder(new javax.swing.border.MatteBorder(null));
        F8.setName("F8"); // NOI18N
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        F9.setBackground(java.awt.Color.darkGray);
        F9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F9.setForeground(new java.awt.Color(255, 255, 255));
        F9.setText("9");
        F9.setBorder(new javax.swing.border.MatteBorder(null));
        F9.setName("F9"); // NOI18N
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        F10.setBackground(java.awt.Color.darkGray);
        F10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        F10.setForeground(new java.awt.Color(255, 255, 255));
        F10.setText("10");
        F10.setBorder(new javax.swing.border.MatteBorder(null));
        F10.setName("F10"); // NOI18N
        F10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F10ActionPerformed(evt);
            }
        });

        G10.setBackground(java.awt.Color.darkGray);
        G10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G10.setForeground(new java.awt.Color(255, 255, 255));
        G10.setText("10");
        G10.setBorder(new javax.swing.border.MatteBorder(null));
        G10.setName("G10"); // NOI18N
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });

        G9.setBackground(java.awt.Color.darkGray);
        G9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G9.setForeground(new java.awt.Color(255, 255, 255));
        G9.setText("9");
        G9.setBorder(new javax.swing.border.MatteBorder(null));
        G9.setName("G9"); // NOI18N
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        G8.setBackground(java.awt.Color.darkGray);
        G8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G8.setForeground(new java.awt.Color(255, 255, 255));
        G8.setText("8");
        G8.setBorder(new javax.swing.border.MatteBorder(null));
        G8.setName("G8"); // NOI18N
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        G7.setBackground(java.awt.Color.darkGray);
        G7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G7.setForeground(new java.awt.Color(255, 255, 255));
        G7.setText("7");
        G7.setBorder(new javax.swing.border.MatteBorder(null));
        G7.setName("G7"); // NOI18N
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        G6.setBackground(java.awt.Color.darkGray);
        G6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G6.setForeground(new java.awt.Color(255, 255, 255));
        G6.setText("6");
        G6.setBorder(new javax.swing.border.MatteBorder(null));
        G6.setName("G6"); // NOI18N
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        G5.setBackground(java.awt.Color.darkGray);
        G5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G5.setForeground(new java.awt.Color(255, 255, 255));
        G5.setText("5");
        G5.setBorder(new javax.swing.border.MatteBorder(null));
        G5.setName("G5"); // NOI18N
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        G4.setBackground(java.awt.Color.darkGray);
        G4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G4.setForeground(new java.awt.Color(255, 255, 255));
        G4.setText("4");
        G4.setBorder(new javax.swing.border.MatteBorder(null));
        G4.setName("G4"); // NOI18N
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        G3.setBackground(java.awt.Color.darkGray);
        G3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G3.setForeground(new java.awt.Color(255, 255, 255));
        G3.setText("3");
        G3.setBorder(new javax.swing.border.MatteBorder(null));
        G3.setName("G3"); // NOI18N
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G2.setBackground(java.awt.Color.darkGray);
        G2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G2.setForeground(new java.awt.Color(255, 255, 255));
        G2.setText("2");
        G2.setBorder(new javax.swing.border.MatteBorder(null));
        G2.setName("G2"); // NOI18N
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G1.setBackground(java.awt.Color.darkGray);
        G1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        G1.setForeground(new java.awt.Color(255, 255, 255));
        G1.setText("1");
        G1.setBorder(new javax.swing.border.MatteBorder(null));
        G1.setName("G1"); // NOI18N
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H10.setBackground(java.awt.Color.darkGray);
        H10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H10.setForeground(new java.awt.Color(255, 255, 255));
        H10.setText("10");
        H10.setBorder(new javax.swing.border.MatteBorder(null));
        H10.setName("H10"); // NOI18N
        H10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H10ActionPerformed(evt);
            }
        });

        H9.setBackground(java.awt.Color.darkGray);
        H9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H9.setForeground(new java.awt.Color(255, 255, 255));
        H9.setText("9");
        H9.setBorder(new javax.swing.border.MatteBorder(null));
        H9.setName("H9"); // NOI18N
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });

        H8.setBackground(java.awt.Color.darkGray);
        H8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H8.setForeground(new java.awt.Color(255, 255, 255));
        H8.setText("8");
        H8.setBorder(new javax.swing.border.MatteBorder(null));
        H8.setName("H8"); // NOI18N
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });

        H7.setBackground(java.awt.Color.darkGray);
        H7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H7.setForeground(new java.awt.Color(255, 255, 255));
        H7.setText("7");
        H7.setBorder(new javax.swing.border.MatteBorder(null));
        H7.setName("H7"); // NOI18N
        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });

        H6.setBackground(java.awt.Color.darkGray);
        H6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H6.setForeground(new java.awt.Color(255, 255, 255));
        H6.setText("6");
        H6.setBorder(new javax.swing.border.MatteBorder(null));
        H6.setName("H6"); // NOI18N
        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });

        H5.setBackground(java.awt.Color.darkGray);
        H5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H5.setForeground(new java.awt.Color(255, 255, 255));
        H5.setText("5");
        H5.setBorder(new javax.swing.border.MatteBorder(null));
        H5.setName("H5"); // NOI18N
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });

        H4.setBackground(java.awt.Color.darkGray);
        H4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H4.setForeground(new java.awt.Color(255, 255, 255));
        H4.setText("4");
        H4.setBorder(new javax.swing.border.MatteBorder(null));
        H4.setName("H4"); // NOI18N
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        H3.setBackground(java.awt.Color.darkGray);
        H3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H3.setForeground(new java.awt.Color(255, 255, 255));
        H3.setText("3");
        H3.setBorder(new javax.swing.border.MatteBorder(null));
        H3.setName("H3"); // NOI18N
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        H2.setBackground(java.awt.Color.darkGray);
        H2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H2.setForeground(new java.awt.Color(255, 255, 255));
        H2.setText("2");
        H2.setBorder(new javax.swing.border.MatteBorder(null));
        H2.setName("H2"); // NOI18N
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        H1.setBackground(java.awt.Color.darkGray);
        H1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        H1.setForeground(new java.awt.Color(255, 255, 255));
        H1.setText("1");
        H1.setBorder(new javax.swing.border.MatteBorder(null));
        H1.setName("H1"); // NOI18N
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        I10.setBackground(java.awt.Color.darkGray);
        I10.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I10.setForeground(new java.awt.Color(255, 255, 255));
        I10.setText("10");
        I10.setBorder(new javax.swing.border.MatteBorder(null));
        I10.setName("I10"); // NOI18N
        I10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I10ActionPerformed(evt);
            }
        });

        I9.setBackground(java.awt.Color.darkGray);
        I9.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I9.setForeground(new java.awt.Color(255, 255, 255));
        I9.setText("9");
        I9.setBorder(new javax.swing.border.MatteBorder(null));
        I9.setName("I9"); // NOI18N
        I9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I9ActionPerformed(evt);
            }
        });

        I8.setBackground(java.awt.Color.darkGray);
        I8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I8.setForeground(new java.awt.Color(255, 255, 255));
        I8.setText("8");
        I8.setBorder(new javax.swing.border.MatteBorder(null));
        I8.setName("I8"); // NOI18N
        I8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I8ActionPerformed(evt);
            }
        });

        I7.setBackground(java.awt.Color.darkGray);
        I7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I7.setForeground(new java.awt.Color(255, 255, 255));
        I7.setText("7");
        I7.setBorder(new javax.swing.border.MatteBorder(null));
        I7.setName("I7"); // NOI18N
        I7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I7ActionPerformed(evt);
            }
        });

        I6.setBackground(java.awt.Color.darkGray);
        I6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I6.setForeground(new java.awt.Color(255, 255, 255));
        I6.setText("6");
        I6.setBorder(new javax.swing.border.MatteBorder(null));
        I6.setName("I6"); // NOI18N
        I6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I6ActionPerformed(evt);
            }
        });

        I5.setBackground(java.awt.Color.darkGray);
        I5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I5.setForeground(new java.awt.Color(255, 255, 255));
        I5.setText("5");
        I5.setBorder(new javax.swing.border.MatteBorder(null));
        I5.setName("I5"); // NOI18N
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });

        I4.setBackground(java.awt.Color.darkGray);
        I4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I4.setForeground(new java.awt.Color(255, 255, 255));
        I4.setText("4");
        I4.setBorder(new javax.swing.border.MatteBorder(null));
        I4.setName("I4"); // NOI18N
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        I3.setBackground(java.awt.Color.darkGray);
        I3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I3.setForeground(new java.awt.Color(255, 255, 255));
        I3.setText("3");
        I3.setBorder(new javax.swing.border.MatteBorder(null));
        I3.setName("I3"); // NOI18N
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        I2.setBackground(java.awt.Color.darkGray);
        I2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I2.setForeground(new java.awt.Color(255, 255, 255));
        I2.setText("2");
        I2.setBorder(new javax.swing.border.MatteBorder(null));
        I2.setName("I2"); // NOI18N
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        I1.setBackground(java.awt.Color.darkGray);
        I1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        I1.setForeground(new java.awt.Color(255, 255, 255));
        I1.setText("1");
        I1.setBorder(new javax.swing.border.MatteBorder(null));
        I1.setName("I1"); // NOI18N
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        J8.setBackground(java.awt.Color.darkGray);
        J8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J8.setForeground(new java.awt.Color(255, 255, 255));
        J8.setText("8");
        J8.setBorder(new javax.swing.border.MatteBorder(null));
        J8.setName("J8"); // NOI18N
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        J7.setBackground(java.awt.Color.darkGray);
        J7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J7.setForeground(new java.awt.Color(255, 255, 255));
        J7.setText("7");
        J7.setBorder(new javax.swing.border.MatteBorder(null));
        J7.setName("J7"); // NOI18N
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });

        J6.setBackground(java.awt.Color.darkGray);
        J6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J6.setForeground(new java.awt.Color(255, 255, 255));
        J6.setText("6");
        J6.setBorder(new javax.swing.border.MatteBorder(null));
        J6.setName("J6"); // NOI18N
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });

        J5.setBackground(java.awt.Color.darkGray);
        J5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J5.setForeground(new java.awt.Color(255, 255, 255));
        J5.setText("5");
        J5.setBorder(new javax.swing.border.MatteBorder(null));
        J5.setName("J5"); // NOI18N
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J4.setBackground(java.awt.Color.darkGray);
        J4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J4.setForeground(new java.awt.Color(255, 255, 255));
        J4.setText("4");
        J4.setBorder(new javax.swing.border.MatteBorder(null));
        J4.setName("J4"); // NOI18N
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J3.setBackground(java.awt.Color.darkGray);
        J3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        J3.setForeground(new java.awt.Color(255, 255, 255));
        J3.setText("3");
        J3.setBorder(new javax.swing.border.MatteBorder(null));
        J3.setName("J3"); // NOI18N
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(522, 522, 522))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(120, 120, 120)
                                        .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(102, 102, 102)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Books seats after confirmation
     */
    private static void bookSeats() {
        // Setting the relavent seats color to red
        selectedSeats.stream().forEach(seat -> {
            seat.setBackground(Color.red);
            seat.setForeground(Color.white);
            bookedSeats.add(seat);
        });
        // Resetting data
        resetInformation();
        selectedSeats.clear();
        ticketCount = 0;
        // Disabling "Book Now" button
        if (bookedSeats.size() == totalSeatsCount) {
            // Disabling "Book Now" button
            bookNowButton.setEnabled(false);
            bookNowButton.setForeground(Color.red);
            bookNowButton.setText("SOLD.!");
        }
    }
    
    /**
     * Resets all information on the frame
     */
    private static void resetInformation() {
        tickets.setText("");
        total.setText("");
        seats.setText("");
        errorMessage.setText("");
    }
    
    /**
     * Displays the total in the frame
     */
    private void diplayITotal() {    
        // Calculating the back seat count
        long backSeatsCount = selectedSeats.stream()
                .filter(e -> e.getName().contains("J"))
                .count();
        // Calculating the front seat count
        long frontSeatsCount = ticketCount - backSeatsCount;
        // Calculating the total with correponding costs
        double total = backSeatsCount*20 + frontSeatsCount*12;
        // Diplaying the total in the frame
        this.total.setText(total + " $");      
    }
    
    /**
     * Creates a sub stream
     * @param <T> obj type
     * @param stream original stream
     * @param startIndex start index
     * @param endIndex end index
     * @return sub stream
     */
    public static <T> Stream<T> getSliceOfStream(Stream<T> stream, 
            int startIndex, int endIndex) {
        return stream
            .skip(startIndex)
            .limit(endIndex - startIndex + 1);
    }
    
    /**
     * Displays the Seats in the frame
     */
    private void diplaySeats() {      
        ArrayList<String> seatsArr = new ArrayList(); // to break lines
        // breaking lines 10 by 10
        int i = 0;
        int j = 0;
        while (i < selectedSeats.size()) {
            if ( (i == j + 9 && j >= 0) || i == selectedSeats.size() - 1){
                // Creating line and add it to seatArr
                String seatsStrTemp = getSliceOfStream(selectedSeats.stream()
                        .map(seat -> seat.getName()),j,i)
                        .collect(Collectors.joining(", "));
                seatsArr.add(seatsStrTemp);
                j = i + 1;
            }
            i++;
        }
        // joinig seatArr with <br/> to break lines
        seatsStr = "<html>" + seatsArr.stream()
                .collect(Collectors.joining("<br/>")) +"</html>";
        
        this.seats.setText(seatsStr);  // Displaying the seats in frame
    }
    
    /**
     * Displays the no of tickets in the frame
     */
    private void displayTicket() {
        tickets.setText(Integer.toString(ticketCount));
    }
    
    /**
     * Displays the information in frame
     */
    private void diplayInformation() {
        displayTicket();
        diplayITotal();
        diplaySeats();
    }
    
    /**
     * Changes color of the seats according to the status
     * Displaying data on the frame
     * @param seat 
     */
    private void grabSeat(javax.swing.JButton seat) {
        // If selected seat is available
        if (seat.getBackground() == Color.darkGray) {
            // Changing seat's color in to green
            seat.setBackground(Color.green);
            seat.setForeground(Color.DARK_GRAY);
            errorMessage.setText(""); // Clearing the error msg
            selectedSeats.add(seat);// Adding the seat to the selectedSeats arr
            ticketCount++;  // Incrementing the ticketCount
            
        // If selected seat is selected already
        } else if (seat.getBackground() == Color.green) {
            // Changing seat's color in to gray
            seat.setBackground(Color.darkGray);
            seat.setForeground(Color.white);
            errorMessage.setText("");   // Clearing the error msg
            // Removing the seat from selectedSeats arr
            selectedSeats.remove(seat); 
            ticketCount--;  // Decrementing ticketCount
            
        // If selected seat is red
        } else if (seat.getBackground() == Color.red) {
            // Showing an error msg
            errorMessage.setText("Selected Seat is already Booked");
        } 
        
        if (bookedSeats.size() == totalSeatsCount) {
            // Showing an error msg
            errorMessage.setText("All Seats are booked.!");
        }
        diplayInformation();    // Displaying information
    }
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        grabSeat(A1);   // Calling grabSeat
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        grabSeat(A2);   // Calling grabSeat
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        grabSeat(A3);   // Calling grabSeat
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        grabSeat(A4);   // Calling grabSeat
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        grabSeat(A5);   // Calling grabSeat
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        grabSeat(A6);   // Calling grabSeat
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        grabSeat(A7);   // Calling grabSeat
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        grabSeat(A8);   // Calling grabSeat
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        grabSeat(A9);   // Calling grabSeat
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        grabSeat(A10);   // Calling grabSeat
    }//GEN-LAST:event_A10ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        grabSeat(B1);   // Calling grabSeat
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        grabSeat(B2);   // Calling grabSeat
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        grabSeat(B3);   // Calling grabSeat
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        grabSeat(B4);   // Calling grabSeat
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        grabSeat(B5);   // Calling grabSeat
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        grabSeat(B6);   // Calling grabSeat
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        grabSeat(B7);   // Calling grabSeat
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        grabSeat(B8);   // Calling grabSeat
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        grabSeat(B9);   // Calling grabSeat
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        grabSeat(B10);   // Calling grabSeat
    }//GEN-LAST:event_B10ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        grabSeat(D1);   // Calling grabSeat
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        grabSeat(D2);   // Calling grabSeat
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        grabSeat(D3);   // Calling grabSeat
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
       grabSeat(D4);   // Calling grabSeat
    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        grabSeat(D5);   // Calling grabSeat
    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        grabSeat(D6);   // Calling grabSeat
    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        grabSeat(D7);   // Calling grabSeat
    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        grabSeat(D8);   // Calling grabSeat
    }//GEN-LAST:event_D8ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        grabSeat(E1);   // Calling grabSeat
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        grabSeat(E2);   // Calling grabSeat
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        grabSeat(E3);   // Calling grabSeat
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        grabSeat(E4);   // Calling grabSeat
    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        grabSeat(E5);   // Calling grabSeat
    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        grabSeat(E6);   // Calling grabSeat
    }//GEN-LAST:event_E6ActionPerformed
    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        grabSeat(E7);   // Calling grabSeat
    }//GEN-LAST:event_E7ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        grabSeat(E8);   // Calling grabSeat        
    }//GEN-LAST:event_E8ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        grabSeat(E9);   // Calling grabSeat
    }//GEN-LAST:event_E9ActionPerformed

    private void E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E10ActionPerformed
        grabSeat(E10);   // Calling grabSeat
    }//GEN-LAST:event_E10ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        grabSeat(F1);   // Calling grabSeat
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        grabSeat(F2);   // Calling grabSeat
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        grabSeat(F3);   // Calling grabSeat
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        grabSeat(F4);   // Calling grabSeat
    }//GEN-LAST:event_F4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        grabSeat(F5);   // Calling grabSeat
    }//GEN-LAST:event_F5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        grabSeat(F6);   // Calling grabSeat
    }//GEN-LAST:event_F6ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        grabSeat(F7);   // Calling grabSeat
    }//GEN-LAST:event_F7ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        grabSeat(F8);   // Calling grabSeat
    }//GEN-LAST:event_F8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        grabSeat(F9);   // Calling grabSeat
    }//GEN-LAST:event_F9ActionPerformed

    private void F10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F10ActionPerformed
        grabSeat(F10);   // Calling grabSeat
    }//GEN-LAST:event_F10ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed
        grabSeat(G10);   // Calling grabSeat
    }//GEN-LAST:event_G10ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
        grabSeat(G9);   // Calling grabSeat
    }//GEN-LAST:event_G9ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        grabSeat(G8);   // Calling grabSeat
    }//GEN-LAST:event_G8ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        grabSeat(G7);   // Calling grabSeat
    }//GEN-LAST:event_G7ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        grabSeat(G6);   // Calling grabSeat
    }//GEN-LAST:event_G6ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        grabSeat(G5);   // Calling grabSeat
    }//GEN-LAST:event_G5ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        grabSeat(G4);   // Calling grabSeat
    }//GEN-LAST:event_G4ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        grabSeat(G3);   // Calling grabSeat
    }//GEN-LAST:event_G3ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        grabSeat(G2);   // Calling grabSeat
    }//GEN-LAST:event_G2ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        grabSeat(G1);   // Calling grabSeat
    }//GEN-LAST:event_G1ActionPerformed

    private void H10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H10ActionPerformed
        grabSeat(H10);   // Calling grabSeat
    }//GEN-LAST:event_H10ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        grabSeat(H9);   // Calling grabSeat
    }//GEN-LAST:event_H9ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        grabSeat(H8);   // Calling grabSeat
    }//GEN-LAST:event_H8ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        grabSeat(H7);   // Calling grabSeat
    }//GEN-LAST:event_H7ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        grabSeat(H6);   // Calling grabSeat
    }//GEN-LAST:event_H6ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        grabSeat(H5);   // Calling grabSeat
    }//GEN-LAST:event_H5ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        grabSeat(H4);   // Calling grabSeat
    }//GEN-LAST:event_H4ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        grabSeat(H3);   // Calling grabSeat
    }//GEN-LAST:event_H3ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        grabSeat(H2);   // Calling grabSeat
    }//GEN-LAST:event_H2ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        grabSeat(H1);   // Calling grabSeat
    }//GEN-LAST:event_H1ActionPerformed

    private void I10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I10ActionPerformed
        grabSeat(I10);   // Calling grabSeat
    }//GEN-LAST:event_I10ActionPerformed

    private void I9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I9ActionPerformed
        grabSeat(I9);   // Calling grabSeat
    }//GEN-LAST:event_I9ActionPerformed

    private void I8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I8ActionPerformed
        grabSeat(I8);   // Calling grabSeat
    }//GEN-LAST:event_I8ActionPerformed

    private void I7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I7ActionPerformed
        grabSeat(I7);   // Calling grabSeat
    }//GEN-LAST:event_I7ActionPerformed

    private void I6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I6ActionPerformed
        grabSeat(I6);   // Calling grabSeat
    }//GEN-LAST:event_I6ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        grabSeat(I5);   // Calling grabSeat
    }//GEN-LAST:event_I5ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        grabSeat(I4);   // Calling grabSeat
    }//GEN-LAST:event_I4ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        grabSeat(I3);   // Calling grabSeat
    }//GEN-LAST:event_I3ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        grabSeat(I2);   // Calling grabSeat
    }//GEN-LAST:event_I2ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        grabSeat(I1);   // Calling grabSeat
    }//GEN-LAST:event_I1ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
        grabSeat(J8);   // Calling grabSeat
    }//GEN-LAST:event_J8ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
        grabSeat(J7);   // Calling grabSeat
    }//GEN-LAST:event_J7ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
        grabSeat(J6);   // Calling grabSeat
    }//GEN-LAST:event_J6ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        grabSeat(J5);   // Calling grabSeat
    }//GEN-LAST:event_J5ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        grabSeat(J4);   // Calling grabSeat
    }//GEN-LAST:event_J4ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        grabSeat(J3);   // Calling grabSeat
    }//GEN-LAST:event_J3ActionPerformed

    /**
     * Redirects to Booking Confirmation Page with click
     * @param evt 
     */
    private void bookNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowButtonActionPerformed
        // If no seats selected
        if (selectedSeats.isEmpty()) {
            // Showing an error msg
            JOptionPane.showMessageDialog(rootPane,
                        "Please select Seats to Book.!",
               "No Seat Selected", JOptionPane.ERROR_MESSAGE);           
        } else {
            // Creating an object and opening ConfirmationForm in new window
            ConfirmBooking confirmPage = new ConfirmBooking(movie.getText(),
                    time.getText(),tickets.getText(), total.getText(), 
                    seats.getText());
            confirmPage.setVisible(true);
            confirmPage.setAlwaysOnTop(true);
            confirmPage.requestFocus();
        }
    }//GEN-LAST:event_bookNowButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                    .UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton E1;
    private javax.swing.JButton E10;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton E9;
    private javax.swing.JButton F1;
    private javax.swing.JButton F10;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton G1;
    private javax.swing.JButton G10;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton G9;
    private javax.swing.JButton H1;
    private javax.swing.JButton H10;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JButton H9;
    private javax.swing.JButton I1;
    private javax.swing.JButton I10;
    private javax.swing.JButton I2;
    private javax.swing.JButton I3;
    private javax.swing.JButton I4;
    private javax.swing.JButton I5;
    private javax.swing.JButton I6;
    private javax.swing.JButton I7;
    private javax.swing.JButton I8;
    private javax.swing.JButton I9;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JButton J5;
    private javax.swing.JButton J6;
    private javax.swing.JButton J7;
    private javax.swing.JButton J8;
    private static javax.swing.JButton bookNowButton;
    private static javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel movie;
    private static javax.swing.JLabel seats;
    private static javax.swing.JLabel tickets;
    private javax.swing.JLabel time;
    private static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
