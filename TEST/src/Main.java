

import java.util.Random;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int woodHealth = 2;
        int gameChoice = 0;
        int playerHealth = 20;
        int playerExp = 0;
        int enemyHealth = 100;
        boolean block = false;
        boolean summoned = false;
        int charge = 0;
        int randomChoice = rand.nextInt(6);

            System.out.println("Hello would you like to play? Y/N");
            String decision = scan.nextLine().toLowerCase();

            if (decision.equals("y")||decision.equals("yes")) {
                System.out.println("Ok Lets set the Scene");
                System.out.println("-----WELCOME TO THE GAME-----");

                System.out.println();

                System.out.println("\033[3mYou wake up its the summer of 1985\033[0m");
                System.out.println("\033[3mWhat will you do\n~bed~\n~get up~\n~work~\033[0m");
                decision = scan.nextLine().toLowerCase();
                switch (decision) {
                    case "get up" ->
                            System.out.println("\033[3mYou get up and make yourself breakfast... You are bored so you go to the arcade..\033[0m");
                    case "bed" -> {
                        System.out.println("\033[3mYou choose to stay in your bed and rest. I guess nothing eventful will happen\033[0m");
                        System.exit(0);
                    }
                    case "work" ->
                            System.out.println("\033[3mSilly, you don't even have a job but you gotta make money some how, So you go to the arcade to look for a job\033[0m");
                    default -> {
                        System.out.println(" you choose top do nothing huh? guess you end the game");
                        System.exit(0);
                    }
                }
                System.out.println();
                System.out.println("{-----THE ARCADE-----}");
                System.out.println();
                System.out.println("\033[3mSomeway somehow you end up at the arcade but it looks strange.\033[0m");
                System.out.println("'Wow that's weird I don't remember when this place being closed?'");
                System.out.println("Investigate? Y/N");
                decision = scan.nextLine().toLowerCase();
                if(decision.equals("y")||decision.equals("yes")){
                    System.out.println("\033[3mYou look around noticing some divets in the wood boards in front of the arcade. \nThey seem weak...\033[0m");
                    while (woodHealth != 0) {
                        System.out.println("Try to break the wood? Y/N");
                        decision = scan.nextLine();
                        if(decision.equalsIgnoreCase("y") && woodHealth == 3){
                            System.out.println("You punch at the wood it becomes more brittle ");
                            woodHealth -= 1;
                            System.out.println();
                        } else if (decision.equalsIgnoreCase("y") && woodHealth == 2) {
                            System.out.println("you punch at the wood once and it seems to being breaking down.");
                            woodHealth -= 1;
                            System.out.println();
                        } else if (decision.equalsIgnoreCase("y") && woodHealth == 1) {
                            System.out.println("you punch one last time and the wood breaks you csn finally walk in");
                            System.out.println();
                            woodHealth -= 1;
                        }else{
                            System.out.println("You look at the barred door wow it has wood in front");
                            System.out.println();
                        }

                    }
                    System.out.println();
                    System.out.println("You look around the dusty arcade it looks like nobody has been here for years");
                    System.out.println("Your senses are being drowned out by the dust around you");
                    System.out.println();
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("'This is so strange I thought this place was open yesterday'");
                    System.out.println("*WANDERING ADVENTURER TO DAWN THE BLADE YOU MUST GIVE EVERYTHING TO IT*");
                    System.out.println("'what was that'");
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println();

                    System.out.println("\033[3m~What will you do?~\n~look~\n~cry~\033[0m");
                    decision = scan.nextLine().toLowerCase();

                    switch (decision) {
                        case "look" -> {
                            System.out.println("You look around the dusty arcade and in the corner of your eye you see a blue light");
                            System.out.println();
                            System.out.println("*YOU SEEM WORTHY ENOUGH I WILL USE MY POWER TO FILL YOUR CURIOSITY*");
                            gameChoice = 1;
                        }
                        case "cry" -> {
                            System.out.println("You cry and you think about your situation and how dust surrounds you");
                            System.out.println();
                            System.out.println("*YOU LACK THE FOUNDATION TO WIELD BUT WITH ENOUGH TIME TO MOLD YOU SHALL BE WORTHY*");
                            gameChoice = 2;
                        }
                        default -> {
                            System.out.println("\033[3m~You do nothing and you feel a crushing presence~\033[0m");
                            System.out.println();
                            System.out.println("*PITIFUL CREATURE YOU DON'T HAVE THE POWER TO WIELD ME*");
                            System.out.println("\033[3m~You pass out...~\033[0m");
                            System.exit(0);
                        }

                    }
                    System.out.println();
                    if (gameChoice == 1){
                        System.out.println("'What was that... Who's there... Stay back'");
                    }else{
                        System.out.println("'What was that... Who's there... Get away from me'");
                    }
                    System.out.println("*I ART THOU THOU ART I*");
                    System.out.println("\033[3mYou start to feel a painful headache\033[0m");
                    System.out.println();
                    if(gameChoice == 1){
                        System.out.println("\033[3m*USE YOUR RAGE TO CALL UPON ME*\033[0m");
                    }else{
                        System.out.println("\033[3m*USE YOUR SORROW TO CALL UPON MY NAME*\033[0m");
                    }
                    System.out.println("__________________________________");
                    if (gameChoice == 1){
                        System.out.println("\033[3mYou feel it call to you...\033[0m");
                        System.out.println();
                        System.out.println("\033[3mKUSHO\033[1m");
                    }else{
                        System.out.println("\033[3mYou feel it call to you...\033[0m");
                        System.out.println();
                        System.out.println("\033[3mMIGIZINAGI\033[1m");
                    }
                    System.out.println("-----YOU PASSED OUT-----");
                    System.out.println("\033[3mYou wake up its the winter of 1985\033[1m");
                    System.out.println("\033[3m~What will you do?~\n~get up~\n~look~\033[1m");
                    decision = scan.nextLine().toLowerCase();
                    switch (decision) {
                        case "get up" ->
                                System.out.println("\033[3mYou get up and make yourself breakfast... You don't think about anyhting thst happened yet\033[0m");
                        case "look" ->
                                System.out.println("\033[3mYou look around.. you see past due bill papers piling up. You smell rotten meat coming from the fridge... How long have I been out? \033[0m");
                        default -> System.out.println("\033[3mYou try to remember what had happened in the arcade everything seems fuzzy... \033[0m");
                    }
                    System.out.println("*AH. YOU HAVE FINALLY AWOKEN*");
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println();
                    System.out.println("'who was that...'");
                    System.out.println();
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("*YOU FOOL YOU DON'T REMEMBER. I'M YOUR TRUE SELF, THE EMBODIMENT OF YOUR FREEDOM*");
                    System.out.println();
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("'Hmm I see, does this mean I will be able to use cool super human abilities'");
                    if (gameChoice == 1){
                        System.out.println("*YES WITH MY ABILITY I GRANT YOU THE POWER TO CONTROL INFINITY*");
                    }else{
                        System.out.println("*YES WITH MY ABILITY I GRANT YOU THE POWER TO COPY OTHER ABILITIES*");
                    }
                    System.out.println("'Huh? I have powers but why I'm a normal person'");
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("\033[3mYou hear a rumble\033[0m");
                    System.out.println("BOOOOM");
                    System.out.println();
                    System.out.println("Your best friend comes crashing through your window...");
                    System.out.println();
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("'ALEX WHAT THE HELL MAN!'");
                    System.out.println();
                    System.out.println("~dude im so sorry~");
                    System.out.println();
                    System.out.println("\033[3mA cloaked man runs in after him\033[");
                    System.out.println();
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("{ꮪꮎ ꭹꮎꮼ ꭺꭱꭼ ꭲꮋꭼ ꮎꮑꭼ ꮤꮋꮎ ꭲꮎꮎꮶ ꮖꭲ?}");
                    System.out.println("{ꮖꭲ ꮪꭼꭼꮇꮪ ꭹꮎꮼ ꮇꮼꮪꭲ ꭰꮖꭼ ꮁꮎꭱ ꭹꮎꮼꭱ ꮪꮖꮑꮪ}");
                    System.out.println("{ᎻᎪᎻᎪᎻᎪᎻᎪᎻᎪᎻᎪ}");
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println();
                    System.out.println("'What do you mean I took it?'");
                    System.out.println("I haven't taken anything");
                    System.out.println("Click *ENTER* to continue");
                    System.out.println();
                    decision = scan.nextLine();
                    System.out.println("{ꮁꮎꭱᏽꭼꭲ ꭲꮋꭺꭲ ꮇꮎꭱꭲꭺꮮ ꮤꭼ ꮇꮼꮪꭲ ꮁꮖᏽꮋꭲ!}");
                    System.out.println();
                    System.out.println("\033[3mThe Hooded Figure Stands infront of you\033[0m");
                                    System.out.println();
                                    System.out.println("\033[3m~Will you fight?~\033[0m");
                                    decision = scan.nextLine().toLowerCase();
                                    if (decision.equals("y")||decision.equals("yes")){

                                        System.out.println("*THIS IS MORE LIKE IT TO USE YOUR POWER YOU MUST SUBMIT AND CALL MY NAME OUT*");
                                        System.out.println();

                                        while (enemyHealth > 0) {
                                            block = false;
                                            System.out.println("\033[3m~What will you do~\n~punch~\n~summon~\n~block~\n~sp1~\n~sp2~\033[0m");
                                            decision = scan.nextLine().toLowerCase();
                                            switch (decision) {
                                                case "punch":
                                                    System.out.println("\033[3mYou Punch at the hooded figure it seemed to do little to no damage\033[0m");
                                                    enemyHealth -= 5;
                                                    charge += 1;
                                    System.out.println("*BRINGING OUT YOUR FIST INSTEAD OF USING YOUR TRUE POWER.. STUBBORN I SEE*");
                                    break;
                                case "summon":
                                    if (summoned == false) {
                                        System.out.println("You Try to summon your ability");
                                        System.out.println("\033[3mA Sword appears infront of you\033[0m");
                                        System.out.println();
                                        System.out.println("Click *ENTER* to continue");
                                        System.out.println();
                                        decision = scan.nextLine();
                                        System.out.println("*YOU KNOW WHAT YOU MUST DO*");
                                        System.out.println();
                                        System.out.println("\033[3mYou stab yourself in the chest with the sword\033[0m");
                                        System.out.println();
                                        System.out.println("'THE BLADE IS ME'");
                                        System.out.println("*THE BLADE IS ME*");
                                        summoned = true;
                                        charge += 1;
                                    } else {
                                        System.out.println("You have already summoned your ability");
                                    }
                                    break;
                                case "block":
                                    System.out.println("You get ready to block the next attack");
                                    block = true;
                                    break;
                                case "sp1":
                                    if (summoned == true) {
                                        if (gameChoice == 1){
                                            System.out.println("'Kusho application red'");
                                            System.out.println();
                                            System.out.println("\033[3mYou launch a red ball forward from your finger that zaps throw the hooded figure\033[0m");
                                            enemyHealth -= 10;
                                            charge += 2;
                                        }else{
                                            System.out.println("'I'll use your ability as my own..'");
                                            System.out.println();
                                            System.out.println("\033[3mYou dash forward with green kinetic energy and slam the hooded figure into the ground\033[0m");
                                            enemyHealth -= 10;
                                            charge += 2;
                                        }


                                    }else{
                                        System.out.println("\033[3mYou have yet to summon your ability\033[0m");
                                    }
                                    break;
                                case "sp2":
                                    if (summoned == true) {
                                        if (charge >= 6){
                                           if (gameChoice == 1){
                                               System.out.println("'Maximum output: Kusho Application: red'");
                                               System.out.println();
                                               System.out.println("\033[3mThe red ball grows on your finger and seems unstable as you launch it fades out of existence \nThhen it strikes the hood man behind him\033[0m");
                                               enemyHealth -= 30;
                                               charge -= 6;

                                           }else{
                                               System.out.println("'I'll enhance your own ability..'");
                                               System.out.println();
                                               System.out.println("\033[3mTaking the stored kinetic energy you dash ahead \nspin your whole body and kick the hooded figure in his stomach\033[0m");
                                               enemyHealth -= 30;
                                               charge -= 6;
                                           }
                                        }else{
                                            System.out.println("not enough charge");
                                        }
                                    }
                                    else {
                                        System.out.println("Not summoned");


                                    }
                                    break;
                                default:
                                    System.out.println("\033[3mYou stand there not doing anything\033[0m");
                                    System.out.println("*WELP THIS IS GONNA HURT*");
                                    break;
                            }
                            System.out.println("\033[3mThe hood figure swings at you\033[0m");
                            if(block == true){
                                System.out.println("You seemingly blocked the damage");
                                playerHealth -= 1;
                            }else{
                                playerHealth -= 3;
                            }
                            if (summoned == true){
                                playerHealth += 2;
                            }
                            System.out.println();
                            System.out.println("-----PLAYER HEALTH: " + playerHealth + "-----");
                            System.out.println("-----ENEMY HEALTH: " + enemyHealth + "-----");
                            System.out.println("-----CHARGE: " + charge + "-----");
                            System.out.println();
                            if (playerHealth == 0){
                                System.out.println("As the hooded figure finally does his last slash you fall and die");
                                System.exit(0);
                            }
                        }

                        playerExp += 10;

                        System.out.println();
                        System.out.println("\033[3mYou feel your abilities grow stronger!\033[3m");
                        System.out.println("Press *ENTER* TO Continue");
                        String enter = scan.nextLine();
                        System.out.println();
                        System.out.println("\033[3mAs You hit the masked figure you can see his face you don't reconigze him but you believe he could get you answer\033[0m");
                        System.out.println();
                        System.out.println("\033[3mYour friend wakes up\033[0m");
                        System.out.println("Press *ENTER* TO Continue");
                        enter = scan.nextLine();
                        System.out.println();
                        System.out.println("'ALEX what THE HELL WAS THAT!!'");
                        System.out.println("Press *ENTER* TO Continue");
                        enter = scan.nextLine();
                        System.out.println();
                        System.out.println("~dude he's totally a old friend of mine~");
                        System.out.println();
                        System.out.println("'Be honest dude there is no time for joking around'");
                        System.out.println();
                        System.out.println("~aight man i'll catch you~");
                                        System.out.println("\033[3mYou see alex jump out the window he came from and limp away\033[0m");
                                        System.out.println();
                                        System.out.println("Press *ENTER* TO Continue");
                                        enter = scan.nextLine();
                                        System.out.println();
                                        System.out.println("'WHAT THE -'");
                                        System.out.println("\033[3m An old pocket watch that you notice starts to glow from your pocket\033[0m");
                                        System.out.println("'What is this....'");
                                        System.out.println();
                                        System.out.println("Press *ENTER* TO Continue");
                                        enter = scan.nextLine();
                                        System.out.println();
                                        System.out.println("*YOU KNOW WHAT I AM *");
                                        System.out.println();
                                        System.out.println("\033[3mA darker version of yourself with white robes on appears infront of you\033[0m");
                                        System.out.println();
                                        System.out.println("Press *ENTER* TO Continue");
                                        enter = scan.nextLine();
                                        System.out.println();





                    }else{
                        System.out.println("{ᏚᎾ ᏴᎬ ᏆᎢ}");
                        System.out.println("\033[3mThe Hooded figure slices off your head\033[0m");
                        System.exit(0);
                    }



                }else{
                    System.out.println("\033[3mYou decide to turn around and to not look into it any further...\033[0m");
                    System.exit(0);
                }
            } else {
                System.out.println("Ok goodbye");
                System.exit(0);
            }
        

    }
}