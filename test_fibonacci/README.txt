ファイル：
　fibonacci.class	:テスト対象のコンパイル済のファイル
  Main.class		:実行するためのコンパイル済のMainプログラム
  Main.java  		:テスト対象を呼び出すサンプルプログラム←改変して良い
  README.txt		:このファイル

説明：
  fobonacci.class がテスト対象のプログラムであり、ブラックボックステストの
			対象である。
  このクラスファイルの中には、作者の異なる3つの階乗を求めるプログラムが
  収められている。
		    fibo1( n )
        fibo2( n )
        fibo3( n )
  　関数は以下の３つでいずれも整数型nを引数とし、fibonacciのn項(n<=0)を求める
  プログラムであり、戻り値の型は long int (64ビット符号付き整数型)である。
 
  Main.javaを改変して fibonacci.class をブラックボックステトを実施するものとする。

起動について：
　　コンパイル方法：
		Main.java と fibonacci.class が同じフォルダにあることが前提
		＄ javac -encoding UTF-8 Main.java
		コマンドでコンパイルする。コンパイル後には、同じフォルダ内に
		Main.class ができたことを確認する
	実行方法：
		Main.class と fibonacci.class が同じフォルダ内にあることを前提とし
		＄ java Main Main.class fibonacci.class
		※サンプルプログラムでは3種類の関数で  21: 10946 が表示される
      ちなみに結果は合っている。

Main.java に関数の呼び出し方法が書かれている。
基本的には fibonacci.fiboｘ( n ) のように関数名（メソッド名）の
前にクラス名 "fibonacci." をつけること。



