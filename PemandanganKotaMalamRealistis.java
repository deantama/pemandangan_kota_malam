import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PemandanganKotaMalamRealistis extends JPanel {
    // Nama Kelompok: Pemandangan Kota Malam Realistis
    // Anggota:
    // 1. Rizky Muhammad Anshori - 202143500817
    // 2. Dean Pratama Putra - 202143500783
    // 3. M Akbar Gymnastiar - 202143500810
    // 4. Martha Nur Hanifah - 202143500790
    // 5. Muhamad Yusup Maulana - 202143500752

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pemandangan Kota Malam Hari");
        PemandanganKotaMalamRealistis panel = new PemandanganKotaMalamRealistis();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Menggambar langit malam
        g2d.setPaint(new Color(10, 10, 30)); // Warna biru gelap untuk langit malam
        g2d.fillRect(0, 0, getWidth(), getHeight());

          // Menambahkan teks nama kelompok di langit
          g2d.setPaint(Color.WHITE);
          g2d.setFont(new Font("Arial", Font.BOLD, 14));
          g2d.drawString("Kelompok Pemandangan Kota Malam", 50, 50);
  
          // Menambahkan teks nama anggota di langit
          g2d.drawString("1. Rizky Muhammad Anshori - 202143500817", 50, 70);
          g2d.drawString("2. Dean Pratama Putra - 202143500783", 50, 90);
          g2d.drawString("3. M Akbar Gymnastiar - 202143500810", 50, 110);
          g2d.drawString("4. Martha Nur Hanifah - 202143500790", 50, 130);
          g2d.drawString("5. Muhamad Yusup Maulana - 202143500752", 50, 150);
        // Menggambar bulan
        g2d.setPaint(Color.YELLOW);
        g2d.fill(new Ellipse2D.Double(600, 50, 80, 80)); // Bulan

        // Menggambar bintang
        g2d.setPaint(Color.WHITE);
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight() / 2); // Bintang hanya di bagian atas
            g2d.fill(new Ellipse2D.Double(x, y, 3, 3)); // Bintang kecil
        }

        // Menggambar gedung dengan bayangan
        drawBuilding(g2d, 50, 300, 100, 200, new Color(70, 130, 180));
        drawBuilding(g2d, 200, 250, 120, 250, new Color(255, 228, 196));
        drawBuilding(g2d, 350 ,200 ,150 ,300 ,new Color(144 ,238 ,144));
        drawBuilding(g2d, 520 ,220 ,130 ,280,new Color(192 ,192 ,192));
        
        drawBuilding(g2d, 670 ,250 ,140 ,350,new Color(240 ,230 ,140));
        
        drawBuilding(g2d, 100 ,350 ,160 ,220,new Color(100 ,149 ,237));
        
        drawBuilding(g2d, 250 ,320 ,180 ,260,new Color(255 ,215 ,0));
        
        drawBuilding(g2d, 400 ,300 ,140 ,300,new Color(255 ,182 ,193));
        
        drawBuilding(g2d, 550 ,270 ,160 ,280,new Color(135 ,206 ,235));

        // Menggambar jalan
        g2d.setPaint(Color.DARK_GRAY);
        g2d.fillRect(0, 500, getWidth(), 100); // Jalan

        // Menggambar mobil di depan gedung
        drawCar(g2d, 150, 520);
        drawCar(g2d, 350, 520);
        drawCar(g2d, 600, 520);
    }

    private void drawBuilding(Graphics2D g2d,
                              int x,
                              int y,
                              int width,
                              int height,
                              Color wallColor) {
        
        // Menggambar dinding bangunan
        g2d.setPaint(wallColor);
        g2d.fillRect(x, y, width, height);

       // Menggambar jendela pada bangunan
       g2d.setPaint(Color.LIGHT_GRAY);
       for (int i = 0; i < width / 40; i++) {
           for (int j = 0; j < height / 40; j++) {
               if (Math.random() > 0.5) { // Acak untuk menyalakan lampu jendela
                   g2d.setPaint(Color.YELLOW); // Lampu menyala
               } else {
                   g2d.setPaint(Color.LIGHT_GRAY); // Jendela mati
               }
               g2d.fillRect(x + i * 40 + 10, y + j * 40 + 20, 30, 30); // Jendela
           }
       }
   }

   private void drawCar(Graphics2D g2d, int x, int y) {
       // Menggambar badan mobil
       g2d.setPaint(Color.RED);
       g2d.fillRect(x, y - 20, 60, 20); // Badan mobil

       // Menggambar atap mobil
       g2d.setPaint(Color.DARK_GRAY);
       g2d.fillRect(x + 10, y - 30, 40, 10); // Atap mobil
       
       // Menggambar roda mobil
       g2d.setPaint(Color.BLACK);
       g2d.fill(new Ellipse2D.Double(x + 10, y - 10, 10, 10)); // Roda kiri
       g2d.fill(new Ellipse2D.Double(x + 40, y - 10, 10, 10)); // Roda kanan
   }
}
