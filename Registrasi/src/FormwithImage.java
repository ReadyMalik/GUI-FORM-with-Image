import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormwithImage {
    private JTextField textNo;
    private JComboBox boxATM;
    private JComboBox boxBank;
    private JTextField textNama;
    private JButton simpanButton;
    private JButton uploadButton;
    private JLabel Pict;
    private JTextArea outputLine;
    private JPanel rootPanel;
    public String NFile;

    public void insertingDataToFile(String dataMasuk) throws IOException{
        try {
            FileWriter myFile = new FileWriter("fileData.txt", true);
            myFile.write(dataMasuk);
            myFile.close();
            System.out.println("Succesfully wrote to the File");
        } catch (IOException ex) {
            System.out.println("An error Occured");
            ex.printStackTrace();
        }
    }

    public FormwithImage() {

        uploadButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JFileChooser uploadImage = new JFileChooser();
            int showOpenDialog = uploadImage.showOpenDialog(null);

            if(showOpenDialog == JFileChooser.APPROVE_OPTION){
                NFile = uploadImage.getSelectedFile().getName();

                File theImage = uploadImage.getSelectedFile();
                String theImagePath = theImage.getAbsolutePath();

                ImageIcon icon = new ImageIcon(theImagePath);
                Image gambar = icon.getImage().getScaledInstance(Pict.getWidth(),Pict.getHeight(), Image.SCALE_SMOOTH);

                Pict.setIcon(new ImageIcon(gambar));
            }

        }
    });

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no = textNo.getText();
                String ATM =(String) boxATM.getSelectedItem();
                String bank =(String) boxBank.getSelectedItem();
                String nama = textNama.getText();

                Data dt = new Data();
                dt.setNo(no);
                dt.setATM(ATM);
                dt.setBank(bank);
                dt.setNama(nama);

                String output = ("\n\nTersimpan!"+"\nNomor Kartu : " + no + "\nJenis ATM : " + ATM + "\nBank : " + bank + "\nNama Pemilik : " + nama+"\nFile Gambar : "+NFile);
        outputLine.append(output);

                try {
                    insertingDataToFile(output + "\n\n");
                    NFile = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
