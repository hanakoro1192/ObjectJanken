/**
 *オブジェクト思考によるジャンケンプログラム 
 */
public class ObjectJanken{
    public static void main(String[] args){
        //審判(斎藤さん)のインスタンス作成
        Judge saito = new Judge();

        //プレイヤー１(村田さん)の作成
        Player murata = new Player("村田さん");

        //プレイヤー２(山田さん)の生成
        Player yamada = new Player("山田さん");

        //村田さんと山田さんをプレイヤーとしてジャンケンを始める
        saito.startJanken(murata, yamada);
    }
}