DROP TABLE album_info;
DROP TABLE music_info;
DROP TABLE playlist_info;
DROP TABLE user_info;

CREATE TABLE user_info(
    user_id VARCHAR2(50) PRIMARY KEY,
    user_name VARCHAR2(20),
    user_nickname VARCHAR2(50),
    user_password VARCHAR2(100),
    email VARCHAR2(100),
    phone_number VARCHAR2(11),
    profile_img BLOB
);

CREATE TABLE follow_list(
    follower_id VARCHAR2(50),
    following_id VARCHAR2(50)
);

CREATE TABLE music_info(
    song_id NUMBER PRIMARY KEY, --시퀀스 & 트리거로 자동 추가
    song_name VARCHAR2(100),
    aritst_name VARCHAR2(50),
    genre VARCHAR2(50),
    album_img BLOB
);

CREATE TABLE playlist_info(
    playlist_id NUMBER PRIMARY KEY, --시퀀스 & 트리거로 자동 추가
    user_id VARCHAR2(50),
    playlist_name VARCHAR2(100),
    image BLOB
);

DROP TABLE playlist_song;
CREATE TABLE playlist_song(
    playlist_id NUMBER,
    song_id NUMBER
);


CREATE SEQUENCE playlist_seq
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;
  
CREATE OR REPLACE TRIGGER playlist_trigger
BEFORE INSERT ON playlist_info
FOR EACH ROW
BEGIN
    SELECT playlist_seq.NEXTVAL INTO:NEW.playlist_id FROM dual;
END;

CREATE SEQUENCE music_seq
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;
  
CREATE OR REPLACE TRIGGER music_trigger
BEFORE INSERT ON music_info
FOR EACH ROW
BEGIN
    SELECT music_seq.NEXTVAL INTO:NEW.song_id FROM dual;
END;
/

-----------------------

SET DEFINE OFF;

INSERT INTO music_info(song_name, artist_name, genre)
SELECT 'Love Lee', 'AKMU(악뮤)', '댄스' FROM DUAL UNION ALL
SELECT '후라이의 꿈', 'AKMU(악뮤)', '포크/블루스' FROM DUAL UNION ALL

SELECT '넌 감동이었어', '성시경', '발라드' FROM DUAL UNION ALL
SELECT '희재', '성시경', '국화꽃 향기 OST' FROM DUAL UNION ALL
SELECT '거리에서', '성시경', '발라드' FROM DUAL UNION ALL
SELECT 'I Love U', '성시경', '발라드' FROM DUAL UNION ALL
SELECT '내게 오는길', '성시경', '발라드' FROM DUAL UNION ALL

SELECT 'Golden','Harry Styles','팝(pop)' FROM DUAL UNION ALL
SELECT 'My Eyes','Travis Scott', '힙합(hiphop)' FROM DUAL UNION ALL
SELECT 'Baggy Jeans','NCT U','케이팝(Kpop)' FROM DUAL UNION ALL
SELECT 'Magnolia','Playboi Carti', '힙합(hiphop)' FROM DUAL UNION ALL
SELECT 'Kiss it Better', 'Rihanna', '팝(pop)' FROM DUAL;

INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('All I Want for Christmas Is You', 'Mariah Carey', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Silent Night', 'Mariah Carey', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Joy to the World', 'Mariah Carey', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Santa Claus Is Comin to Town', 'Mariah Carey', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Miss You Most', 'Mariah Carey', '팝(pop)');

INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('all-american bitch', 'Olivia Rodrigo', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('vampire', 'Olivia Rodrigo', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('get him back!', 'Olivia Rodrigo', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('love is embrassing', 'Olivia Rodrigo', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('teenage dream', 'Olivia Rodrigo', '팝(pop)');

INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('New Jeans', '뉴진스', '케이팝(Kpop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Super Shy', '뉴진스', '케이팝(Kpop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('ETA', '뉴진스', '케이팝(Kpop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Cool with you', '뉴진스', '케이팝(Kpop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Get up', '뉴진스', '케이팝(Kpop)');

INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('섬으로 가요', '카더가든', '록(Rock)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('그저 그런 날', '카더가든', '록(Rock)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Lost 2', '카더가든', '록(Rock)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Home Sweet Home', '카더가든', '록(Rock)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('젊은 꿈', '카더가든', '록(Rock)');

INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Welcome To New York', 'Taylor Swift', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Blank Space', 'Taylor Swift', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Style', 'Taylor Swift', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Out Of The Woods', 'Taylor Swift', '팝(pop)');
INSERT INTO music_info (song_name, artist_name, genre)
VALUES ('Wildest Dreams', 'Taylor Swift', '팝(pop)');