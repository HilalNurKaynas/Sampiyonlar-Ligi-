import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Team> group1 = new ArrayList<Team>();
    public static ArrayList<Team> group2 = new ArrayList<Team>();
    public static ArrayList<Team> group3 = new ArrayList<Team>();
    public static ArrayList<Team> group4 = new ArrayList<Team>();
    public static ArrayList<Team> group5 = new ArrayList<Team>();
    public static ArrayList<Team> group6 = new ArrayList<Team>();
    public static ArrayList<Team> group7 = new ArrayList<Team>();
    public static ArrayList<Team> group8 = new ArrayList<Team>();
    public static ArrayList<Team> lastTeams = new ArrayList<>();

    public static void last16() {
        int max1 = -99, index1 = 0, avg1 = 0;
        int max2 = -99, index2 = 0, avg2 = 0;
        int max3 = -99, index3 = 0, avg3 = 0;
        int max4 = -99, index4 = 0, avg4 = 0;
        int max5 = -99, index5 = 0, avg5 = 0;
        int max6 = -99, index6 = 0, avg6 = 0;
        int max7 = -99, index7 = 0, avg7 = 0;
        int max8 = -99, index8 = 0, avg8 = 0;

        for(int j = 0; j<2; j++) {
            for(int i = 0; i<group1.size(); i++) {

                if(group1.get(i).getPoint() > max1) {
                    index1 = i;
                    max1 = group1.get(i).getPoint();
                }else if(group1.get(i).getPoint() == max1) {
                    if(group1.get(i).getAverage() > avg1){
                        index1 = i;
                        avg1 = group1.get(i).getAverage();
                    }
                }

                if(group2.get(i).getPoint() > max2) {
                    index2 = i;
                    max2 = group2.get(i).getPoint();
                }else if(group2.get(i).getPoint() == max2) {
                    if(group2.get(i).getAverage() > avg2){
                        index2 = i;
                        avg2 = group2.get(i).getAverage();
                    }
                }


                if(group3.get(i).getPoint() > max3) {
                    index3 = i;
                    max3 = group3.get(i).getPoint();
                }else if(group3.get(i).getPoint() == max3) {
                    if(group3.get(i).getAverage() > avg3){
                        index3 = i;
                        avg3 = group3.get(i).getAverage();
                    }
                }

                if(group4.get(i).getPoint() > max4) {
                    index4 = i;
                    max4 = group4.get(i).getPoint();
                }else if(group4.get(i).getPoint() == max4) {
                    if(group4.get(i).getAverage() > avg4){
                        index4 = i;
                        avg4 = group4.get(i).getAverage();
                    }
                }

                if(group5.get(i).getPoint() > max5) {
                    index5 = i;
                    max5 = group5.get(i).getPoint();
                }else if(group5.get(i).getPoint() == max5) {
                    if(group5.get(i).getAverage() > avg5){
                        index5 = i;
                        avg5 = group5.get(i).getAverage();
                    }
                }

                if(group6.get(i).getPoint() > max6) {
                    index6 = i;
                    max6 = group6.get(i).getPoint();
                }else if(group6.get(i).getPoint() == max6) {
                    if(group6.get(i).getAverage() > avg6){
                        index6 = i;
                        avg6 = group6.get(i).getAverage();
                    }
                }

                if(group7.get(i).getPoint() > max7) {
                    index7 = i;
                    max7 = group7.get(i).getPoint();
                }else if(group7.get(i).getPoint() == max7) {
                    if(group7.get(i).getAverage() > avg7){
                        index7 = i;
                        avg7 = group7.get(i).getAverage();
                    }
                }

                if(group8.get(i).getPoint() > max8) {
                    index8 = i;
                    max8 = group8.get(i).getPoint();
                }else if(group8.get(i).getPoint() == max8) {
                    if(group8.get(i).getAverage() > avg8){
                        index8 = i;
                        avg8 = group8.get(i).getAverage();
                    }
                }
            }

            lastTeams.add(group1.get(index1));
            group1.remove(index1);

            lastTeams.add(group2.get(index2));
            group2.remove(index2);

            lastTeams.add(group3.get(index3));
            group3.remove(index3);

            lastTeams.add(group4.get(index4));
            group4.remove(index4);

            lastTeams.add(group5.get(index5));
            group5.remove(index5);

            lastTeams.add(group6.get(index6));
            group6.remove(index6);

            lastTeams.add(group7.get(index7));
            group7.remove(index7);

            lastTeams.add(group8.get(index8));
            group8.remove(index8);
            max1 = 0;
            avg1 = 0;
            max2 = 0;
            avg2 = 0;
            max3 = 0;
            avg3 = 0;
            max4 = 0;
            avg4 = 0;
            max5 = 0;
            avg5 = 0;
            max6 = 0;
            avg6 = 0;
            max7 = 0;
            avg7 = 0;
            max8 = 0;
            avg8 = 0;
        }

    }

    public static void game() {
        for(int i = 0; i<4; i++) {
            //GROUP 1
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group1.get(i).setScored(t1);
                group1.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group1.get(i).setPoint(group1.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group1.get(i).setPoint(group1.get(i).getPoint() + 2);
                }
                group1.get(i).setAverage(group1.get(i).getScored() - group1.get(i).getGoaltaken());
            }

            //GROUP 2
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group2.get(i).setScored(t1);
                group2.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group2.get(i).setPoint(group2.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group2.get(i).setPoint(group2.get(i).getPoint() + 2);
                }
                group2.get(i).setAverage(group2.get(i).getScored() - group2.get(i).getGoaltaken());
            }

            //GROUP 3
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group3.get(i).setScored(t1);
                group3.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group3.get(i).setPoint(group3.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group3.get(i).setPoint(group3.get(i).getPoint() + 2);
                }
                group3.get(i).setAverage(group3.get(i).getScored() - group3.get(i).getGoaltaken());
            }

            //GROUP 4
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group4.get(i).setScored(t1);
                group4.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group4.get(i).setPoint(group4.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group4.get(i).setPoint(group4.get(i).getPoint() + 2);
                }
                group4.get(i).setAverage(group4.get(i).getScored() - group4.get(i).getGoaltaken());
            }

            //GROUP 5
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group5.get(i).setScored(t1);
                group5.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group5.get(i).setPoint(group5.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group5.get(i).setPoint(group5.get(i).getPoint() + 2);
                }
                group5.get(i).setAverage(group5.get(i).getScored() - group5.get(i).getGoaltaken());
            }

            //GROUP 6
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group6.get(i).setScored(t1);
                group6.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group6.get(i).setPoint(group6.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group6.get(i).setPoint(group6.get(i).getPoint() + 2);
                }
                group6.get(i).setAverage(group6.get(i).getScored() - group6.get(i).getGoaltaken());
            }

            //GROUP 7
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group7.get(i).setScored(t1);
                group7.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group7.get(i).setPoint(group7.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group7.get(i).setPoint(group7.get(i).getPoint() + 2);
                }
                group7.get(i).setAverage(group7.get(i).getScored() - group7.get(i).getGoaltaken());
            }

            //GROUP 8
            for(int j = 0; j<2; j++) {
                int t1 = new Random().nextInt(8);
                int t2 = new Random().nextInt(8);
                group8.get(i).setScored(t1);
                group8.get(i).setGoaltaken(t2);

                if(t1 > t2) {
                    group8.get(i).setPoint(group8.get(i).getPoint() + 3);
                }else if (t1 == t2) {
                    group8.get(i).setPoint(group8.get(i).getPoint() + 2);
                }
                group8.get(i).setAverage(group8.get(i).getScored() - group8.get(i).getGoaltaken());
            }
        }
    }

    public static void generateGroups(ArrayList<Team> teams) {
        ArrayList<Team> tmp = teams;

        int count = 0;

        while(tmp.size()>0) {
            boolean selected = false;
            //Group 1
            if(count < 4) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group1.size() == 0) {
                        group1.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group1.size(); j++) {
                        if(group1.get(j).getBag() == t1.getBag() || group1.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group1.add(t1);
                        tmp.remove(rnd);
                    }
                }
            //Group 2
            }else if(count >= 4 && count < 8) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group2.size() == 0) {
                        group2.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group2.size(); j++) {
                        if(group2.get(j).getBag() == t1.getBag() || group2.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group2.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 3
            }else if(count >= 8 && count < 12) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group3.size() == 0) {
                        group3.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group3.size(); j++) {
                        if(group3.get(j).getBag() == t1.getBag() || group3.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group3.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 4
            }else if(count >= 12 && count < 16) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group4.size() == 0) {
                        group4.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group4.size(); j++) {
                        if(group4.get(j).getBag() == t1.getBag() || group4.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group4.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 5
            }else if(count >= 16 && count < 20) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group5.size() == 0) {
                        group5.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group5.size(); j++) {
                        if(group5.get(j).getBag() == t1.getBag() || group5.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group5.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 6
            }else if(count >= 20 && count < 24) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group6.size() == 0) {
                        group6.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group6.size(); j++) {
                        if(group6.get(j).getBag() == t1.getBag() || group6.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group6.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 7
            }else if(count >= 24 && count < 28) {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group7.size() == 0) {
                        group7.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group7.size(); j++) {
                        if(group7.get(j).getBag() == t1.getBag() || group7.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group7.add(t1);
                        tmp.remove(rnd);
                    }

                }
            //Group 8
            }else {
                while(!selected) {
                    int rnd = new Random().nextInt(tmp.size());
                    Team t1 = tmp.get(rnd);

                    selected = true;
                    if(group8.size() == 0) {
                        group8.add(t1);
                        tmp.remove(rnd);
                        break;
                    }

                    for(int j = 0; j<group8.size(); j++) {
                        if(group8.get(j).getBag() == t1.getBag() || group8.get(j).getCountry().equals(t1.getCountry())) {
                            selected = false;
                            break;
                        }
                    }

                    if(selected) {
                        group8.add(t1);
                        tmp.remove(rnd);
                    }
                }
            }
            count++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<Team>();

        //Group 1
        Team BayernMunich = new Team("Bayern Munich", "Almanya", 1);
        teams.add(BayernMunich);
        Team Sevilla = new Team("Sevilla", "İspanya", 1);
        teams.add(Sevilla);
        Team RealMadrid = new Team("Real Madrid", "İspanya", 1);
        teams.add(RealMadrid);
        Team Liverpool = new Team("Liverpool", "İngiltere", 1);
        teams.add(Liverpool);
        Team Juventus = new Team("Juventus", "İtalya", 1);
        teams.add(Juventus);
        Team PSG = new Team("Paris Saint-Germain", "Fransa", 1);
        teams.add(PSG);
        Team Zenit = new Team("Zenit", "Rusya", 1);
        teams.add(Zenit);
        Team Porto = new Team("Porto", "Portekiz", 1);
        teams.add(Porto);

        //Group 2
        Team Barcelona = new Team("Barcelona", "İspanya", 2);
        teams.add(Barcelona);
        Team AtleticoMadrid = new Team("Atletico Madrid", "İspanya", 2);
        teams.add(AtleticoMadrid);
        Team MachesterCity = new Team("Machester City", "İngiltere", 2);
        teams.add(MachesterCity);
        Team ManchesterUnited = new Team("Manchester United", "İngiltere", 2);
        teams.add(ManchesterUnited);
        Team BourssiaDortmund = new Team("Bourssia Dortmund", "Almanya", 2);
        teams.add(BourssiaDortmund);
        Team ShaktarDonetsk = new Team("Shaktar Donetsk", "Ukrayna", 2);
        teams.add(ShaktarDonetsk);
        Team Chelsea = new Team("Chelsea", "İngiltere", 2);
        teams.add(Chelsea);
        Team Ajax = new Team("Ajax", "Hollanda", 2);
        teams.add(Ajax);

        //Group 3
        Team DynamoKiev = new Team("Dynamo Kiev", "Ukrayna", 3);
        teams.add(DynamoKiev);
        Team RedBullSalzburg = new Team("RedBull Salzburg", "Almanya", 3);
        teams.add(RedBullSalzburg);
        Team RBLeipzig = new Team("RB Leipzig", "Almanya", 3);
        teams.add(RBLeipzig);
        Team Internazionale = new Team("Internazionale", "İtalya", 3);
        teams.add(Internazionale);
        Team Olympiacos = new Team("Olympiacos", "Yunanistan", 3);
        teams.add(Olympiacos);
        Team Lazio = new Team("Lazio", "İtalya", 3);
        teams.add(Lazio);
        Team Krasnodar = new Team("Krasnodar", "Rusya", 3);
        teams.add(Krasnodar);
        Team Atalanta = new Team("Atalanta", "İtalya", 3);
        teams.add(Atalanta);

        //Group 4
        Team LokomotivMoskova = new Team("Lokomotiv Moskova", "Rusya", 4);
        teams.add(LokomotivMoskova);
        Team Marseille = new Team("Marseille", "Fransa", 4);
        teams.add(Marseille);
        Team ClubBrugge = new Team("Club Brugge", "Belçika", 4);
        teams.add(ClubBrugge);
        Team BorMonchengladbach = new Team("Bor. Mönchengladbach", "Almanya", 4);
        teams.add(BorMonchengladbach);
        Team Galatasaray = new Team("Galatasaray", "Türkiye", 4);
        teams.add(Galatasaray);
        Team Midtjylland = new Team("Midtjylland", "Danimarka", 4);
        teams.add(Midtjylland);
        Team Rennes = new Team("Rennes", "Fransa", 4);
        teams.add(Rennes);
        Team Ferencváros = new Team("Ferencváros", "Macaristan", 4);
        teams.add(Ferencváros);

        generateGroups(teams);


        game();
        last16();
        System.out.println("Son 16 takım:");
        for(int i = 0; i<lastTeams.size(); i++) {
            System.out.println(lastTeams.get(i).getTitle() + " Puan: " + lastTeams.get(i).getPoint() + " Averaj: " + lastTeams.get(i).getAverage() + " Torba: " + lastTeams.get(i).getBag());
        }

    }
}
