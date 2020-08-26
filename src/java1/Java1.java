/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author hashimototakuya
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       //***********************************
       //定数
       //***********************************
       final int QUIZ_MAX = 5;//問題数
       
       //***********************************
       //変数
       //***********************************
       boolean loopFlg = true;//ループフラグ
       int inputNum = 0;//入力番号
       
       int nowQuizNum = 0;//現在出題番号
       int correctTotal = 0;//正解数
       
       //***********************************
       //メイン処理
       //***********************************
       while(loopFlg){
           
       /////////////////////////////////////
       //実行と描画処理
       
       //見出し:現在の状況を表示する
       System.out.println("＊＊＊＊＊＊＊＊＊クイズ＊＊＊＊＊＊＊＊＊＊");
       System.out.println("現在" + (nowQuizNum + 1) + "問目です。");
       System.out.println("現在の正解数は" + correctTotal + "です。");
       System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
       System.out.println("");
       System.out.println("< 問題 >");
       
       //問題を表示する
       switch(nowQuizNum){
           case 0:
               System.out.println("一番大きな数字はどれ");
               System.out.println("");
               System.out.println("---------------------------");
               System.out.println("1:256 2:98776342 3:2147483647");
               
               break;
           case 1:
               System.out.println("スコープはどれ?");
               System.out.println("");
               System.out.println("---------------------------");
               System.out.println("1:キャスト 2:スコープ 3:インクリメント");
               
               break;
           case 2:
               System.out.println("キャストはどれ?");
               System.out.println("");
               System.out.println("---------------------------");
               System.out.println("1:キャスト 2:スコープ 3:インクリメント");
               
               break;
           case 3:
               System.out.println("インクリメントはどれ?");
               System.out.println("");
               System.out.println("---------------------------");
               System.out.println("1:キャスト 2:スコープ 3:インクリメント");
               
               break;
           case 4:
               System.out.println("少ないのはどれ?");
               System.out.println("");
               System.out.println("---------------------------");
               System.out.println("1:0 2:1 3:2");
               
               break;
       }
       System.out.print("答え>");
             
       /////////////////////////////////////////////////////
       //キー入力処理
       int tmpInputNum = 0;//入力番号初期化
       try {
            //初期化処理
            final int IMPUT_MAX = 5;//最大入力値
            //キー入力読込処理（int型）
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int inputInt = sc.nextInt();
            //入力値チェックと入力番号への代入
            if (inputInt > 0 && inputInt <= IMPUT_MAX) {
                tmpInputNum = inputInt;
            } else {
                System.out.println("※　コマンドは" + IMPUT_MAX + "以下で入力して下さい　※　");
            }
        } catch (Exception e) {
            System.out.println("※　数字以外は入力しないで下さい　※　");
        }
        //キー入力処理　
        /////////////////////////////////////////////////////
        
        //入力番号を受け取る
        inputNum = tmpInputNum;
        
        //テスト用：入力結果表示	 
        System.out.println("入力された値は　" + inputNum + "です。");
        
        //表示終了の区切り
        System.out.println("");
        System.out.println("########################################################");
        System.out.println("");
       
        //解答を確認
        switch(nowQuizNum){
            case 0:
                //正解番号確認
                if(inputNum == 3){
                    System.out.println("やった！！正解");
                    correctTotal += 1;//正解数加算
                }else{
                    System.out.println("残念！不正解");
                }
                
                break;
            case 1:
                //正解番号確認
                if(inputNum == 2){
                    System.out.println("やった！！正解");
                    correctTotal += 1;//正解数加算
                }else{
                    System.out.println("残念！不正解");
                }
                
                break;
            case 2:
                //正解番号確認
                if(inputNum == 1){
                    System.out.println("やった！！正解");
                    correctTotal += 1;//正解数加算
                }else{
                    System.out.println("残念！不正解");
                }
                
                break;
            case 3:
                //正解番号確認
                if(inputNum == 3){
                    System.out.println("やった！！正解");
                    correctTotal += 1;//正解数加算
                }else{
                    System.out.println("残念！不正解");
                }
                
                break;
                
            case 4:
                //正解番号確認
                if(inputNum == 1){
                    System.out.println("やった！！正解");
                    correctTotal += 1;//正解数加算
                }else{
                    System.out.println("残念！不正解");
                }
                
                break;
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("＜1を入力してEnterキーを押してください＞");
        
       //問題を進める
       nowQuizNum += 1;
       
       //最大数以上なら
       if(nowQuizNum >= QUIZ_MAX){
           loopFlg = false;//ゲームを終了する
       }
      
            /////////////////////////////////////////////////////
            //キー入力処理　そのまま書き写してください　ここから
            tmpInputNum = 0;//入力番号初期化
            try {
                //初期化処理
                final int IMPUT_MAX = 5;//最大入力値
                //キー入力読込処理（int型）
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int inputInt = sc.nextInt();
                //入力値チェックと入力番号への代入
                if (inputInt > 0 && inputInt <= IMPUT_MAX) {
                    tmpInputNum = inputInt;
                } else {
                    System.out.println("※　コマンドは" + IMPUT_MAX + "以下で入力して下さい　※　");
                }
            } catch (Exception e) {
                System.out.println("※　数字以外は入力しないで下さい　※　");
            }
            //キー入力処理　そのまま書き写してください　ここまで
            /////////////////////////////////////////////////////
       
            //入力番号を受け取る
            inputNum = tmpInputNum;
            
                    //表示終了の区切り
                    System.out.println("");
                    System.out.println("########################################################");
                    System.out.println("");
    }
    
        //結果表示
        System.out.println("＊＊＊＊＊＊＊＊＊クイズ＊＊＊＊＊＊＊＊＊＊");
        System.out.println("");
        System.out.println("あなたの正解数は" + correctTotal + "です。");
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        System.out.println("");
        System.out.println("おしまい");
    }
}