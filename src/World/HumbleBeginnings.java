package World;

public class HumbleBeginnings {

    public HumbleBeginnings(){
    titleOne();


    }


    public void titleOne(){
        System.out.println(
                        "       $$          $$                                                                                                       \n" +
                        "       $$          $$  $$$$$$$ $$      $$$$$  $$$$   $$   $$ $$$$$$$     $$$$$$$$$$   $$$$$      $$$$$$$$$$ $$    $$ $$$$$$$\n" +
                        "       $$    $$    $$  $$      $$     $$     $    $  $ $ $ $ $$              $$      $     $         $$     $$    $$ $$     \n" +
                        "       $$  $$  $$  $$  $$$$$$  $$     $     $      $ $  $  $ $$$$$$          $$     $       $        $$     $$$$$$$$ $$$$$$ \n" +
                        "       $$$$      $$$$  $$      $$     $$     $    $  $     $ $$              $$      $     $         $$     $$    $$ $$     \n" +
                        "       $$          $$  $$$$$$$ $$$$$$$ $$$$$  $$$$   $     $ $$$$$$$         $$       $$$$$          $$     $$    $$ $$$$$$$\n"
        );
        titleTwo();
    }
public void titleTwo(){
    System.out.println(
             "              $$$$                                       $$                         $$                                 \n" +
             "              $$  $$    $$$$$$$  $$       $$  $$$$  $$   $   $$$$$$                 $$           $$      $$$$  $$$$$$  \n" +
             "              $$    $$  $$        $$     $$    $$   $$       $$                     $$          $$$$      $$   $$   $$ \n" +
             "              $$    $$  $$$$$$     $$   $$     $$   $$       $$$$$$                 $$         $$  $$     $$   $$$$$$  \n" +
             "              $$  $$    $$          $$ $$      $$   $$           $$                 $$        $$$$$$$$    $$   $$   $$ \n" +
             "              $$$$      $$$$$$$      $$       $$$$  $$$$$$   $$$$$$                 $$$$$$$  $$      $$  $$$$  $$    $$\n"
    );
    start();
}

public void start(){
    System.out.printf("\n%60s Press any key to continue...\n", " ");

    Controls.pressEnterKey();
    {
        System.out.println("this just happened");
    }
}
}

