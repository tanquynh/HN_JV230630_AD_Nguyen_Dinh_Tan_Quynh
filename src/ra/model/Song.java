package ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Song {
//    ▪ songId – mã bài hát – String (Có 4 ký tự và bắt đầu bằng kí tự S, không trùng lặp)
//▪ songName – tên bài hát – String (Không được để trống)
//▪ descriptions – mô tả bài hát – String
//▪ singer - ca sĩ - Singer (không được null)
//▪ songWriter - người sáng tác- String (không được để trống)
//▪ createdDate- ngày tạo - Date (mặc định là thời gian hệ thống)
//▪ songStatus- trạng thái - boolean
    //    Fields
    private String songId; // 4 ký tự bắt đầu bằng "S" & 3 ký tự số bất kỳ, không trùng lặp
    private String songName; // không được để trống
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus =true;
//    Constructors

    public Song() {
    }

    public Song(String songId, String songName, String descriptions,String singer, String songWriter,Date createdDate,  boolean songStatus) {

        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus =songStatus;
    }

//    Methods
//    Getter/Setter

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songName) {
        this.songWriter = songWriter;
    }
    public String getcreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public String getSongWriter() {
        return songWriter;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

}
    public void inputData(Scanner sc, Song[] songs, int currentSong) {
        // TODO: validate dữ liệu trước khi thêm vào
        boolean isExit = true;
//        Có 4 ký tự và bắt đầu bằng kí tự S, không trùng lặp
        System.out.println("Vui lòng nhập Id bài hát:");
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

