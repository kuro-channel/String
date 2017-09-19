
public class String1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	//
	//helloName("Bob") → "Hello Bob!"
	//helloName("Alice") → "Hello Alice!"
	//helloName("X") → "Hello X!"
	public String helloName(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ");
		builder.append(name);
		builder.append("!");
		return builder.toString();
	}

	//Given two strings, a and b, return the result of putting
	//		them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	//
	//makeAbba("Hi", "Bye") → "HiByeByeHi"
	//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	//makeAbba("What", "Up") → "WhatUpUpWhat"
	public String makeAbba(String a, String b) {
		// 文字列を結合する
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		builder.append(b);
		builder.append(a);
		return builder.toString();
	}

	//The web is built with HTML strings like "<i>Yay</i>" which
	//draws Yay as italic text. In this example, the "i" tag makes <i> and
	//</i> which surround the word "Yay". Given tag and word strings,
	//create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	//
	//makeTags("i", "Yay") → "<i>Yay</i>"
	//makeTags("i", "Hello") → "<i>Hello</i>"
	//makeTags("cite", "Yay") → "<cite>Yay</cite>"
	public String makeTags(String tag, String word) {
		// 文字列を結合する
		StringBuilder builder = new StringBuilder();
		builder.append("<"+tag+">");
		builder.append(word);
		builder.append("</"+tag+">");
		return builder.toString();
	}
}
