package ra.run;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    public static Singer[] singers = new Singer[100];
    public static int currentSinger = 0;
    public static Song[] songs = new Song[100];
    public static int currentSong = 0;
    public static SearchSong[] SearchSong = new SearchSong[100];
    public static int currentSearchSong = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Singer singer = new Singer(singers);
        Song song = new Song(songs);
        SearchSong searchSong = new SearchSong(searchSongs);

        //        Menu lựa chọn điều hướng đến các menu con
        do {
            System.out.println("************************MUSIC-MANAGEMENT*************************\n");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    managerSinger(singer, currentSinger);
                    break;
                case 2:
                    manageSong(song, currentSong);
                    break;
                case 3:
                    manageSearchSong(searchSong, currentSearchSong);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập vào một số nguyên trong khoảng từ 1-4");
            }
        } while (true);

    }
    // Menu quản lý ca sĩ
    public static void managerSinger(StudentService studentService, int currentStudentIndex) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("**************************SINGER-MANAGEMENT**************************");
            System.out.println("1. Nhập số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3. Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4. Xóa ca sĩ theo mã id"); 
            System.out.println("6. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    Thêm mới học sinh
                   addSinger(sc, currentSinger);
                    break;
                case 2:
//                    Hiển thị danh sách ca si đã lưu trữ
                 getStudent(currentSinger);
                    break;
                case 3:
//                    Thay đổi tên ca si theo mã id
                    System.out.println("Nhập vào id ca si muốn sửa tên");
                    int singerId = Integer.parseInt(sc.nextLine());
                    updateSinger(singerId, currentSinger, sc);
                    break;
                case 4:
//                    Xóa học sinh theo mã id
                    System.out.println("Nhập vào id ca si muốn sửa tên");
                    singerId = Integer.parseInt(sc.nextLine());
                    deleteSinger(singerId, currentSinger);
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập vào một số nguyên trong khoảng từ 1-5");
            }

        } while (true);
    }
    // Menu quản lý môn học
    public static void manageSong(SubjectService subjectService, int currentSubjectIndex) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("**************************SONG-MANAGEMENT**************************");
            System.out.println("1. Nhập số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3. Thay đổi tên thng tin bài hát theo mã id");
            System.out.println("4. Xóa bài hát theo mã id"); 
            System.out.println("5. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    Thêm mới môn học
                    subjectService.addSubject(sc, currentSubjectIndex);
                    break;
                case 2:
//                    Hiển thị danh sách tất cả các môn học đã lưu trữ
                    subjectService.getSubject(currentSubjectIndex);
                    break;
                case 3:
//                    Thay đổi tên môn học theo mã id
                    System.out.println("Nhập vào id ca sic muốn sửa tên");
                    int subjectId = Integer.parseInt(sc.nextLine());
                    subjectService.updateSubject(subjectId, currentStudentIndex, sc);
                    break;
                case 4:
//                    Xóa môn học theo mã id
                    System.out.println("Nhập vào id ca si c muốn xóa");
                    subjectId = Integer.parseInt(sc.nextLine());
                    subjectService.deleteSubject(subjectId, currentSubjectIndex);
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập vào một số nguyên trong khoảng từ 1-5");
            }

        } while (true);
    }
    // Menu quản lý điểm thi
    public static void manageSearchSong(MarkService markService, int currentMarkIndex) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("**************************SEARCH-MANAGEMENT**************************");
            System.out.println("1. Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2. Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3. Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4. Hiển thị 10 bài hát được đăng mới nhất");

            System.out.println("5. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập vào một số nguyên trong khoảng từ 1-5");
            }

        } while (true);


        // Phần Music
        public Music[] getSingers() {
            return singers;
        }


        //    CRUD Methods
        public void addSinger(Scanner sc, int currentSinger){
//        TODO: Thêm học sinh vào mảng
//        Gọi đến inputData của Student ở đây để thêm ca sĩ
            System.out.println("Vui lòng nhập số lượng ca sĩ muốn thêm thông tin:");
            int numberOfSinger = Integer.parseInt(sc.nextLine());
//        Nếu số lượng chỗ trống không còn đủ thì không cho thêm
            if(numberOfSinger < this.singer.length - currentSinger){
                for (int i = 0; i < numberOfSinger; i++) {
//                Nhập thông tin cho từng ca sĩ
                    this.singers[currentSinger] = new Singer();
                    this.singers[currentSinger].inputData(sc, this.singers, currentSinger);
                    currentSinger++;
                }
            } else {
                System.err.println("Số vị trí còn trống không đủ");
            }
//
        }
        public void getSinger(int currentSinger){
//        TODO: hiển thị hết các thông tin về học sinh đã lưu trữ
            for (int i = 0; i <= currentSinger; i++) {
                singers[i].displayData();
            }
        }
        public void updateSinger(int singerId, int currentSinger, Scanner sc){
//        TODO: update thông tin ca sĩ trong cơ sở dữ liệu
            boolean found = false;
            for (int i = 0; i < currentSinger; i++) {
                if(this.singers[i].getStudentId() == singerId){
                    found = true;
                    System.out.println("Nhập tên mới:");
                    this.singer[i].setStudentName(sc.nextLine());
                }
            }
            if(!found){
                System.out.println("Không tồn tại id học sinh này trong cơ sở dữ liệu");
            }
        }
        public void deleteSinger(int singerId, int currentSinger){
//        TODO: xóa ca si trong cơ sở dữ liệu
            boolean found = false;
            int deleteIndex = -1;
            for (int i = 0; i < currentSinger; i++) {
                if(this.singers[i].getSingerId() == singerId){
                    found = true;
                    deleteIndex = i;
                }
            }
            if(!found){
                System.out.println("Không tồn tại id ca sĩ này trong cơ sở dữ liệu");
            } else {
//            TODO: kiểm tra ca si có bài hát hay không xong mới xóa

                for (int i = deleteIndex; i < currentSinger-1; i++) {
                        this.singers[i] = this.singers[i+1];
                }
                this.singers[currentSinger] = null;
            }
        }





}
}
