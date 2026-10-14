import java.util.Scanner;
import java.util.Locale;

public class sesion3_btvn02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int soHocVien = 0;
        double tongDiem = 0;
        double diemCaoNhat = 0;
        double diemThapNhat = 10;

        do {
            System.out.println("\n===== MENU NHAP DIEM =====");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Vui long nhap so 1, 2 hoac 3.");
                scanner.next();
                continue;
            }

            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1: {
                    System.out.println(
                            "--- Nhap diem hoc vien (nhap -1 de dung) ---"
                    );

                    while (true) {
                        System.out.print("Nhap diem: ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Vui long nhap mot so.");
                            scanner.next();
                            continue;
                        }

                        double diem = scanner.nextDouble();

                        if (diem == -1) {
                            break;
                        }

                        if (!(diem >= 0 && diem <= 10)) {
                            System.out.println(
                                    "Diem khong hop le. Nhap lai."
                            );
                            continue;
                        }

                        // Cap nhat thong ke
                        soHocVien++;
                        tongDiem += diem;

                        if (diem > diemCaoNhat) {
                            diemCaoNhat = diem;
                        }

                        if (diem < diemThapNhat) {
                            diemThapNhat = diem;
                        }

                        // Xep loai hoc luc
                        if (diem < 5) {
                            System.out.println("Hoc luc: Yeu");
                        } else if (diem < 7) {
                            System.out.println("Hoc luc: Trung binh");
                        } else if (diem < 8) {
                            System.out.println("Hoc luc: Kha");
                        } else if (diem < 9) {
                            System.out.println("Hoc luc: Gioi");
                        } else {
                            System.out.println("Hoc luc: Xuat sac");
                        }
                    }

                    break;
                }

                case 2: {
                    if (soHocVien == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double diemTrungBinh = tongDiem / soHocVien;

                        System.out.println("--- KET QUA ---");
                        System.out.println(
                                "So hoc vien da nhap: " + soHocVien
                        );
                        System.out.printf(
                                Locale.US,
                                "Diem trung binh: %.2f%n",
                                diemTrungBinh
                        );
                        System.out.printf(
                                Locale.US,
                                "Diem cao nhat: %.2f%n",
                                diemCaoNhat
                        );
                        System.out.printf(
                                Locale.US,
                                "Diem thap nhat: %.2f%n",
                                diemThapNhat
                        );
                    }

                    break;
                }

                case 3: {
                    System.out.println("Ket thuc chuong trinh.");
                    scanner.close();
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println(
                            "Lua chon khong hop le. Vui long chon lai."
                    );
            }
        } while (true);
    }
}