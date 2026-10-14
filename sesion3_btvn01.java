import java.util.Scanner;
public class sesion3_btvn01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập thông tin
        System.out.println("===== NHAP THONG TIN HOA DON =====");

        System.out.print("Nhap ten khach hang: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhap so luong mua: ");
        int soLuong = scanner.nextInt();

        System.out.print("Khach co the thanh vien? (true/false): ");
        boolean thanhVien = scanner.nextBoolean();

        // 2. Tính tiền
        double thanhTien = gia * soLuong;
        double giamGia = thanhVien ? thanhTien * 0.10 : 0;
        double vat = thanhTien * 0.08;
        double tongThanhToan = thanhTien - giamGia + vat;

        // 3. In hóa đơn
        System.out.println("\n========== HOA DON ==========");
        System.out.println("Khach hang: " + tenKhachHang);
        System.out.println("San pham: " + tenSanPham);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Don gia: %,.2f VND%n", gia);
        System.out.printf("Thanh tien: %,.2f VND%n", thanhTien);
        System.out.printf("Giam gia thanh vien (10%%): %,.2f VND%n", giamGia);
        System.out.printf("Tien VAT (8%%): %,.2f VND%n", vat);
        System.out.printf("Tong thanh toan: %,.2f VND%n", tongThanhToan);

        scanner.close();
    }
}
