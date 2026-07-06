ファイル：
　Judgement.class	:テスト対象のコンパイル済のファイル
  Main.class		:実行するためのコンパイル済のMainプログラム
  Main.java  		:テスト対象を呼び出すサンプルプログラム←改変して良い
  README.txt		:このファイル

説明：
  Judgement.class がテスト対象のプログラムであり、ブラックボックステストの
			対象である。
  このクラスファイルの中には、内申点，試験の点数から合否を求めるプログラムが
  収められている。
		judgement( float n, int t );
  　この関数はfloat型 nと int型tを引数とし、合否結果を求める
  プログラムであり、戻り値の型は int型である。
   合格を１，不合格を０，エラーを－１とする。
 
  Main.javaを改変して Judgement.class をブラックボックステトを実施するものとする。

起動について：
　　コンパイル方法：
		Main.java と Judgement.class が同じフォルダにあることが前提
		＄ javac Main.java
		コマンドでコンパイルする。コンパイル後には、同じフォルダ内に
		Main.class ができたことを確認する
	実行方法：
		Main.class と Judgement.class が同じフォルダ内にあることを前提とし
		＄ java Main Main.class Judgement.class
		※サンプルプログラムでは3種類の結果が表示される

Main.java に関数の呼び出し方法が書かれている。
基本的には Judgement.judgement( n, t ) のように関数名（メソッド名）の
前にクラス名 Judgement. をつけること。

