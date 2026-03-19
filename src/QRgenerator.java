import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

// UI imports
import javax.swing.*;

public class QRgenerator {

    public static void generateQR(String data, int memberId) {
        try {
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix matrix = writer.encode(data, BarcodeFormat.QR_CODE, 300, 300);

            BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);

            for (int x = 0; x < 300; x++) {
                for (int y = 0; y < 300; y++) {
                    image.setRGB(x, y, matrix.get(x, y) ? 0x000000 : 0xFFFFFF);
                }
            }

            // 🔥 CREATE FOLDER
            File dir = new File("qrs");
            if (!dir.exists()) {
                dir.mkdir();
            }

            // 🔥 CORRECT PATH (id → memberId)
            String path = "qrs/qr_" + memberId + ".png";

            // 🔥 WRITE IMAGE
            ImageIO.write(image, "png", new File(path));

           // System.out.println("📸 QR Generated for Member " + memberId);

            // 🔥 SHOW QR
            showQR(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔥 QR DISPLAY
    public static void showQR(String path) {
        JFrame frame = new JFrame("QR Code");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setVisible(true);
    }
}