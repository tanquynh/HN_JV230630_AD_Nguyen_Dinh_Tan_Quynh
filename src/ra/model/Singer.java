package ra.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Singer {
    private static int nextId = 0;
    private int singerId; // tự động tăng
    private String singerName; // không được để trống
    private int age; //(Phải lớn hơn 0)
    private String nationality;// không được để trống
    private boolean gender = true;
    private String genre; // không được để trống


    public Singer(){
        this.singerId= nextId;
        nextId++;
    }
    public Singer(String singerName, int age, String nationality, boolean gender, String genre ) {
        // singerId tự động tăng
        this.singerId = nextId;
        nextId++;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }
    public int getSingerId() {
    return singerId;
    }
    public String getSingerName() {
    return singerName;
    }
    public void setSingerName(String singerName) {
    this.singerName = singerName;
    }
    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData(Scanner sc, Music[] musics, int currentSinger) {
        // TODO: validate dữ liệu trước khi thêm vào
        boolean isExit = true;
//        singerName => không được để trống
        System.out.println("Vui lòng nhập vào tên ca sĩ:");
        do {
            this.singerName = sc.nextLine();
//            check để trống
            if (!this.singerName.trim().isEmpty()) {
                break;
            } else {
                System.err.println("Tên ca sĩ không được để trống");
            }
        } while (isExit);

        //        age => phải lớn hơn 0
        System.out.println("Vui lòng nhập số tuổi:");
        do {
            this.age = sc.nextInt();
//            check lớn hơn 0
            if (this.singerName >0) {
                break;
            } else {
                System.err.println("Tuổi phải lớn hơn 0");
            }
        } while (isExit);


//        nationality
        System.out.println("Vui lòng nhập vào quốc tịch:");
        do {
            this.nationality = sc.nextLine();
//            check để trống
            if (!this.nationality.trim().isEmpty()) {
                break;
            } else {
                System.err.println("Quốc tịch không được để trống");
            }
        } while (isExit);
//        gender
        System.out.println("Vui lòng nhập vào giới tính (Nam/Nữ):");
        String userInput = sc.nextLine();
        do {
//            check để trống
            if (userInput.trim().toLowerCase().equals("nam") || userInput.trim().toLowerCase().equals("nữ")) {
                if (userInput.trim().toLowerCase().equals("nam")) {
                    this.gender = true;
                    break;
                }
                if (userInput.trim().toLowerCase().equals("nữ")) {
                    this.gender = false;
                    break;
                }
            } else {
                System.out.println("Bạn phải nhập vào là 'Nam' hoặc 'Nữ'");
                break;
            }
        } while (isExit);
//        genre
        System.out.println("Vui lòng nhập vào thể loại:");
        do {
            this.genre = sc.nextLine();
//            check để trống
            if (!this.genre.trim().isEmpty()) {
                break;
            } else {
                System.err.println("Thể loại không được để trống");
            }
        } while (isExit);

        System.out.println("Bạn vừa thêm:");
        displayData();
    }

    public void displayData () {
        System.out.printf("Mã ca sĩ: %d - Tên ca sĩ: %s - Tuổi: %s\n", this.singerId, this.singerName, this.age);
        System.out.printf("Quốc tịch: %s - Giới tính: %s - Thể loại: %s\n", this.nationality, this.gender ? "Nam" : "Nữ", this.genre);

    }





}
