package com.easysubway;

import java.util.ArrayList;
import java.util.HashMap;

public class MyMenu {
    private ArrayList<String> subwayName;
    private HashMap<String, ArrayList<String>> mMenu;
    private String stationNM[] = {"가능",
            "가락시장",
            "가산디지털단지",
            "가양",
            "가재울",
            "가좌",
            "가천대",
            "가평",
            "간석",
            "간석오거리",
            "갈매",
            "갈산",
            "강남",
            "강남구청",
            "강남대",
            "강동",
            "강동구청",
            "강매",
            "강변",
            "강촌",
            "개롱",
            "개봉",
            "개포동",
            "개화",
            "개화산",
            "거여",
            "건대입구",
            "검암",
            "경기광주",
            "경기도청북부청사",
            "경마공원",
            "경복궁",
            "경인교대입구",
            "경전철의정부",
            "경찰병원",
            "계산",
            "계양",
            "고덕",
            "고려대",
            "고속터미널",
            "고잔",
            "고진",
            "곡산",
            "곤제",
            "곤지암",
            "공덕",
            "공릉",
            "공항시장",
            "공항화물청사",
            "과천",
            "관악",
            "광교",
            "광교중앙",
            "광나루",
            "광명",
            "광명사거리",
            "광운대",
            "광화문",
            "광흥창",
            "교대",
            "구로",
            "구로디지털단지",
            "구룡",
            "구리",
            "구반포",
            "구산",
            "구성",
            "구의",
            "구일",
            "구파발",
            "국수",
            "국제업무지구",
            "국회의사당",
            "군자",
            "군포",
            "굴봉산",
            "굴포천",
            "굽은다리",
            "귤현",
            "금곡",
            "금릉",
            "금정",
            "금천구청",
            "금촌",
            "금호",
            "기흥",
            "길동",
            "길음",
            "김량장",
            "김유정",
            "김포공항",
            "까치산",
            "까치울",
            "낙성대",
            "남구로",
            "남동구청",
            "남동인더스파크",
            "남부터미널",
            "남성",
            "남영",
            "남춘천",
            "남태령",
            "남한산성입구",
            "내방",
            "노들",
            "노량진",
            "노원",
            "녹번",
            "녹사평",
            "녹양",
            "녹천",
            "논현",
            "능곡",
            "단대오거리",
            "달월",
            "답십리",
            "당고개",
            "당산",
            "당정",
            "대곡",
            "대공원",
            "대림",
            "대모산입구",
            "대방",
            "대성리",
            "대야미",
            "대청",
            "대치",
            "대화",
            "대흥",
            "덕계",
            "덕소",
            "덕정",
            "도곡",
            "도농",
            "도림천",
            "도봉",
            "도봉산",
            "도심",
            "도원",
            "도화",
            "독립문",
            "독바위",
            "독산",
            "돌곶이",
            "동대문",
            "동대문역사문화공원",
            "동대입구",
            "동두천",
            "동두천중앙",
            "동막",
            "동묘앞",
            "동백",
            "동수",
            "동암",
            "동오",
            "동인천",
            "동작",
            "동천",
            "동춘",
            "두정",
            "둔전",
            "둔촌동",
            "등촌",
            "디지털미디어시티",
            "뚝섬",
            "뚝섬유원지",
            "마곡",
            "마곡나루",
            "마두",
            "마들",
            "마석",
            "마장",
            "마천",
            "마포",
            "마포구청",
            "만수",
            "망우",
            "망원",
            "망월사",
            "망포",
            "매교",
            "매봉",
            "매탄권선",
            "먹골",
            "면목",
            "명동",
            "명일",
            "명지대",
            "명학",
            "모란",
            "모래내시장",
            "목동",
            "몽촌토성",
            "무악재",
            "문래",
            "문산",
            "문정",
            "문학경기장",
            "미금",
            "미아",
            "미아사거리",
            "박촌",
            "반월",
            "반포",
            "발곡",
            "발산",
            "방배",
            "방이",
            "방학",
            "방화",
            "배방",
            "백마",
            "백석",
            "백양리",
            "백운",
            "버티고개",
            "범계",
            "범골",
            "별내",
            "병점",
            "보라매",
            "보문",
            "보산",
            "보정",
            "보평",
            "복정",
            "복정",
            "봉명",
            "봉은사",
            "봉천",
            "봉화산",
            "부개",
            "부발",
            "부천",
            "부천시청",
            "부천종합운동장",
            "부평",
            "부평구청",
            "부평삼거리",
            "부평시장",
            "불광",
            "사가정",
            "사당",
            "사릉",
            "사평",
            "산본",
            "산성",
            "삼가",
            "삼각지",
            "삼동",
            "삼산체육관",
            "삼성",
            "삼성중앙",
            "삼송",
            "상갈",
            "상계",
            "상도",
            "상동",
            "상록수",
            "상봉",
            "상수",
            "상왕십리",
            "상월곡",
            "상일동",
            "상천",
            "상현",
            "새말",
            "새절",
            "샛강",
            "서강대",
            "서대문",
            "서동탄",
            "서부여성회관",
            "서빙고",
            "서울대입구",
            "서울숲",
            "서울역",
            "서정리",
            "서초",
            "서현",
            "석계",
            "석바위시장",
            "석수",
            "석천사거리",
            "석촌",
            "선릉",
            "선바위",
            "선유도",
            "선정릉",
            "선학",
            "성균관대",
            "성복",
            "성수",
            "성신여대입구",
            "성환",
            "세류",
            "세마",
            "세종대왕릉",
            "센트럴파크",
            "소래포구",
            "소사",
            "소요산",
            "송내",
            "송도",
            "송산",
            "송정",
            "송탄",
            "송파",
            "수내",
            "수락산",
            "수리산",
            "수색",
            "수서",
            "수원",
            "수원시청",
            "수유",
            "수지구청",
            "수진",
            "숙대입구",
            "숭실대입구",
            "숭의",
            "시민공원",
            "시청",
            "시청.용인대",
            "신갈",
            "신금호",
            "신길",
            "신길",
            "신길온천",
            "신내",
            "신논현",
            "신답",
            "신당",
            "신대방",
            "신대방삼거리",
            "신도림",
            "신둔도예촌",
            "신림",
            "신목동",
            "신반포",
            "신방화",
            "신사",
            "신설동",
            "신설동",
            "신연수",
            "신용산",
            "신원",
            "신이문",
            "신정",
            "신정네거리",
            "신중동",
            "신창",
            "신촌",
            "신포",
            "신풍",
            "신흥",
            "쌍문",
            "쌍용",
            "아산",
            "아신",
            "아차산",
            "아현",
            "안국",
            "안산",
            "안암",
            "안양",
            "암사",
            "압구정",
            "압구정로데오",
            "애오개",
            "야당",
            "야탑",
            "약수",
            "양수",
            "양원",
            "양재",
            "양재시민의숲",
            "양정",
            "양주",
            "양천구청",
            "양천향교",
            "양평",
            "어룡",
            "어린이대공원",
            "어정",
            "언주",
            "여의나루",
            "여의도",
            "여주",
            "역곡",
            "역삼",
            "역촌",
            "연수",
            "연신내",
            "염창",
            "영등포",
            "영등포구청",
            "영등포시장",
            "영종",
            "영통",
            "예술회관",
            "오금",
            "오류동",
            "오리",
            "오목교",
            "오빈",
            "오산",
            "오산대",
            "오이도",
            "옥수",
            "온수",
            "온양온천",
            "올림픽공원",
            "왕십리",
            "외대앞",
            "용답",
            "용두",
            "용마산",
            "용문",
            "용산",
            "우장산",
            "운길산",
            "운동장.송담대",
            "운서",
            "운연",
            "운정",
            "원당",
            "원덕",
            "원인재",
            "원흥",
            "월계",
            "월곡",
            "월곶",
            "월드컵경기장",
            "월롱",
            "을지로3가",
            "을지로4가",
            "을지로입구",
            "응봉",
            "응암",
            "의왕",
            "의정부",
            "의정부시청",
            "의정부중앙",
            "이대",
            "이매",
            "이수",
            "이천",
            "이촌",
            "이태원",
            "인덕원",
            "인천",
            "인천가좌",
            "인천국제공항",
            "인천논현",
            "인천대공원",
            "인천대입구",
            "인천시청",
            "인천터미널",
            "인하대",
            "일산",
            "일원",
            "임학",
            "작전",
            "잠실",
            "잠실나루",
            "잠실새내",
            "잠원",
            "장승배기",
            "장암",
            "장지",
            "장한평",
            "전대.에버랜드",
            "정발산",
            "정부과천청사",
            "정왕",
            "정자",
            "제기동",
            "제물포",
            "종각",
            "종로3가",
            "종로5가",
            "종합운동장",
            "주안",
            "주안국가산단",
            "주엽",
            "죽전",
            "중계",
            "중곡",
            "중동",
            "중랑",
            "중앙",
            "중화",
            "증미",
            "증산",
            "지석",
            "지식정보단지",
            "지제",
            "지축",
            "지행",
            "직산",
            "진위",
            "창동",
            "창신",
            "천마산",
            "천안",
            "천왕",
            "천호",
            "철산",
            "청계산입구",
            "청구",
            "청담",
            "청라국제도시",
            "청량리",
            "청명",
            "청평",
            "초당",
            "초월",
            "초지",
            "총신대입구",
            "춘의",
            "춘천",
            "충무로",
            "충정로",
            "충정로",
            "캠퍼스타운",
            "탄현",
            "탑석",
            "태릉입구",
            "태평",
            "테크노파크",
            "퇴계원",
            "파주",
            "판교",
            "팔당",
            "평내호평",
            "평촌",
            "평택",
            "풍산",
            "하계",
            "학동",
            "학여울",
            "한강진",
            "한남",
            "한대앞",
            "한성대입구",
            "한양대",
            "한티",
            "합정",
            "합정",
            "행당",
            "행신",
            "혜화",
            "호구포",
            "홍대입구",
            "홍제",
            "화곡",
            "화랑대",
            "화서",
            "화전",
            "화정",
            "회기",
            "회룡",
            "회룡",
            "회현",
            "효자",
            "효창공원앞",
            "흑석",
            "흥선"
    };

    public MyMenu() {
        mMenu                   = new HashMap<>();
        subwayName = new ArrayList<>();


        setHashMap();
        setSubwayName();
    }

    private void setSubwayName(){

        int i=0;
        for(i=0; i<stationNM.length; i++){
            subwayName.add(stationNM[i]);
        }
    }


    private void setHashMap() {
        mMenu.put("subway", subwayName);
    }
    // 각 메뉴 반환
    public ArrayList<String> getMenu(String menuTitle) { return mMenu.get(menuTitle); }
}
