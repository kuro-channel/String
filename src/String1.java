
public class String1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	//
	//	helloName("Bob") → "Hello Bob!"
	//	helloName("Alice") → "Hello Alice!"
	//	helloName("X") → "Hello X!"
	public String helloName(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ");
		builder.append(name);
		builder.append("!");
		return builder.toString();
	}

	//	Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	//
	//	makeAbba("Hi", "Bye") → "HiByeByeHi"
	//	makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	//	makeAbba("What", "Up") → "WhatUpUpWhat"
	public String makeAbba(String a, String b) {
		// 文字列を結合する
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		builder.append(b);
		builder.append(a);
		return builder.toString();
	}

	//	The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	//	the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
	//	create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	//
	//	makeTags("i", "Yay") → "<i>Yay</i>"
	//	makeTags("i", "Hello") → "<i>Hello</i>"
	//	makeTags("cite", "Yay") → "<cite>Yay</cite>"
	public String makeTags(String tag, String word) {
		// 文字列を結合する
		StringBuilder builder = new StringBuilder();
		builder.append("<"+tag+">");
		builder.append(word);
		builder.append("</"+tag+">");
		return builder.toString();
	}

	//	Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
	//	e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
	//
	//	makeOutWord("<<>>", "Yay") → "<<Yay>>"
	//	makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	//	makeOutWord("[[]]", "word") → "[[word]]"
	public String makeOutWord(String out, String word) {
		// outを分割する
		String start = out.substring(0,2);
		String end = out.substring(2);
		// 文字列を結合する
		StringBuilder builder = new StringBuilder();
		builder.append(start);
		builder.append(word);
		builder.append(end);
		return builder.toString();
	}

	//	Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
	//	extraEnd("Hello") → "lololo"
	//	extraEnd("ab") → "ababab"
	//	extraEnd("Hi") → "HiHiHi"
	public String extraEnd(String str) {
		// strの最終2文字を分割する
		String end = str.substring(str.length()-2);
		String result = "";
		for(int i = 0; i <=2; i++){
			result = result + end;
		}
		return result;
	}

	//	Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
	//	If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
	//	Note that str.length() returns the length of a string.
	//
	//	firstTwo("Hello") → "He"
	//	firstTwo("abcdefg") → "ab"
	//	firstTwo("ab") → "ab"
	public String firstTwo(String str) {
		// strのlength()が2文字以下だった場合は、文字列をそのまま返す
		if(str.length() <2){return str;}
		String start = str.substring(0, 2);
		return start;
	}

	//	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	//
	//	firstHalf("WooHoo") → "Woo"
	//	firstHalf("HelloThere") → "Hello"
	//	firstHalf("abcdef") → "abc"
	public String firstHalf(String str) {
		// halfを求める
		int half = str.length() / 2;
		String result = str.substring(0, half);
		return result;
	}
	//	Given a string, return a version without the first and last char, so "Hello" yields "ell".
	//	The string length will be at least 2.

	//	withoutEnd("Hello") → "ell"
	//	withoutEnd("java") → "av"
	//	withoutEnd("coding") → "odin"
	public String withoutEnd(String str) {
		// strのlength()が2文字以下だった場合は、文字列をそのまま返す
		if(str.length() <2){return str;}
		return str.substring(1, str.length()-1);
	}
	//	Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
	//  string on the outside and the longer
	//	string on the inside. The strings will not be the same length, but they may be empty (length 0).
	//
	//	comboString("Hello", "hi") → "hiHellohi"
	//	comboString("hi", "Hello") → "hiHellohi"
	//	comboString("aaa", "b") → "baaab"
	public String comboString(String a, String b) {
		String combo = "";
		if(a.length() > b.length()){
			combo = b + a + b;
		}else if(b.length() > a.length()){
			combo = a + b + a;
		}
		return combo;
	}


	//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
	//
	//nonStart("Hello", "There") → "ellohere"
	//nonStart("java", "code") → "avaode"
	//nonStart("shotl", "java") → "hotlava"
	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	// The string length will be at least 2.
	//
	//
	//left2("Hello") → "lloHe"
	//left2("java") → "vaja"
	//left2("Hi") → "Hi"
	public String left2(String str) {
		if(str.length() <= 2){return str;};
		// 左から最初の2文字をそれ以降の文字と入れ替える
		String left2 = str.substring(0, 2);
		String right = str.substring(2);
		return right + left2;
	}

	//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	//		The string length will be at least 2.
	//
	//
	//right2("Hello") → "loHel"
	//right2("java") → "vaja"
	//right2("Hi") → "Hi"
	public String right2(String str) {
		if(str.length() <= 2){return str;};
		// 右から最初の2文字をそれ以降の文字と入れ替える
		String right2 = str.substring(str.length()-2);
		String left = str.substring(0,str.length()-2);
		return right2 + left;
	}

	//	Given a string, return a string length 1 from its front, unless front is false,
	//	in which case return a string length 1 from its back. The string will be non-empty.

	//	theEnd("Hello", true) → "H"
	//	theEnd("Hello", false) → "o"
	//	theEnd("oh", true) → "o"]
	public String theEnd(String str, boolean front) {
		// frontがtrueの場合は先頭の1文字、falseの場合は後ろの1文字を返す
		if(str.length() <= 1){return str;}
		if(front){
			return str.substring(0, 1);
		}else{
			return str.substring(str.length()-1);
		}
	}
	//	Given a string, return a version without both the first and last char of the string.
	//	The string may be any length, including 0.

	//			withouEnd2("Hello") → "ell"
	//			withouEnd2("abc") → "b"
	//			withouEnd2("ab") → ""
	public String withouEnd2(String str) {
		if(str.length() < 2){return str="";}
		// 先頭と最後尾の文字を抜いた文字列を返す
		String result = str.substring(1, str.length()-1);
		return result;
	}


	// Given a string of even length, return a string made of the middle two chars,
	// so the string "string" yields "ri". The string length will be at least 2.
	//
	//middleTwo("string") → "ri"
	//middleTwo("code") → "od"
	//middleTwo("Practice") → "ct"
	public String middleTwo(String str) {
		if(str.length() < 2){return str;};
		// 文字列の中間地点を求める
		int middle = str.length() / 2;
		String result = str.substring(middle-1, middle+1);
		return result;
	}

	//	Given a string, return true if it ends in "ly".
	//
	//	endsLy("oddly") → true
	//	endsLy("y") → false
	//	endsLy("oddy") → false
	public boolean endsLy(String str) {
		if(str.endsWith("ly")){
			return true;
		}
		return false;
	}

	// Given a string and an int n, return a string made of the first
	// and last n chars from the string. The string length will be at least n.
	//
	//
	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"
	public String nTwice(String str, int n) {
		String front = str.substring(0,n);
		String end = str.substring(str.length()-n);
		return front + end;
	}

	//	Given a string and an index, return a string length 2 starting at the given index.
	//	If the index is too big or too small to define a string length 2,
	//	use the first 2 chars. The string length will be at least 2.
	//
	//	twoChar("java", 0) → "ja"
	//	twoChar("java", 2) → "va"
	//	twoChar("java", 3) → "ja"
	public String twoChar(String str, int index) {
		// 2文字よりも少ない場合はそのまま返す
		if(str.length()<2){return str;};
		String twoChar = "";
		// index+1がstrの長さ以上の場合、もしくは小さい場合は先頭から2文字を抽出
		// それ以外の場合は、indexを起点に2文字を抽出
		if(str.length() <= index +1 || index <0){
			return str.substring(0,2);
		}
		return str.substring(index,index +2);
	}

	//	Given a string of odd length, return the string length 3 from its middle,
	//	so "Candy" yields "and". The string length will be at least 3.
	//
	//	middleThree("Candy") → "and"
	//	middleThree("and") → "and"
	//	middleThree("solving") → "lvi"
	public String middleThree(String str) {
		// strが3文字より小さい場合はそのまま返す
		if(str.length() < 3){return str;}
		// 奇数の真ん中3文字を抽出する
		return str.substring((str.length()/2)-1, (str.length()/2)+2);
	}

	//	Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
	//	such as with "badxxx" or "xbadxx" but not "xxbadxx".
	//	The string may be any length, including 0. Note: use .equals() to compare 2 strings.
	//
	//	hasBad("badxx") → true
	//	hasBad("xbadxx") → true
	//	hasBad("xxbadxx") → false
	public boolean hasBad(String str) {
		// strが3文字より小さい場合はそのまま返す
		if(str.length() < 3){return false;}
		// 0文字目、または1文字目が"bad"で始まる場合、trueを返す
		if(str.substring(0,3).equals("bad")){
			return true;
		}else if(str.length() >= 4 && str.substring(1,4).equals("bad")){
			return true;
		}
		return false;
	}


	//Given a string, return a string length 2 made of its first 2 chars.
	//	If the string length is less than 2, use '@' for the missing chars.
	//
	//atFirst("hello") → "he"
	//atFirst("hi") → "hi"
	//atFirst("h") → "h@"
	public String atFirst(String str) {
		// 2文字よりも少ない場合、"@"をつける
		switch (str.length()) {
		case 0:
			return "@@";
		case 1:
			return str +"@";
		default:
			break;
		}
		// 先頭2文字を抽出して返す
		return str.substring(0, 2);
	}

	//	Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
	//	so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
	//
	//	lastChars("last", "chars") → "ls"
	//	lastChars("yo", "java") → "ya"
	//	lastChars("hi", "") → "h@"
	public String lastChars(String a, String b) {
		// 共に空文字だった場合は"@@"を返す
		if(a.length() == 0 && b.length() == 0){
			return "@@";
		}
		// aかb、いずれかの長さが0の場合は"@"をつける
		if(a.length() == 0){
			a = "@";
		}else if(b.length() == 0){
			b = "@";
		}
		return a.substring(0,1) + b.substring(b.length()-1, b.length());
	}

	// Given two strings, append them together (known as "concatenation") and return the result.
	// However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
	//
	// conCat("abc", "cat") → "abcat"
	// conCat("dog", "cat") → "dogcat"
	// conCat("abc", "") → "abc"
	public String conCat(String a, String b) {
		// aとbいずれかが空文字の場合
		if(a.length() == 0 || b.length() == 0){
			return a + b;
		}
		// aの接尾語とbの接頭語が一致していた場合、文字を重ねて結合する
		if(a.substring(a.length()-1).equals(b.substring(0,1))){
			return a + b.substring(1);
		}
		return a + b;
	}

	//	Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
	//
	//	lastTwo("coding") → "codign"
	//	lastTwo("cat") → "cta"
	//	lastTwo("ab") → "ba"
	public String lastTwo(String str) {
		// 2文字よりも短い場合、strをそのまま返る
		if(str.length() < 2){return str;};
		// 接頭語2文字を入れ替える
		String lastTwo = str.substring(str.length()-1) +
				str.substring(str.length()-2, str.length()-1);
		return str.substring(0,str.length()-2) + lastTwo;
	}
	//	Given a string, if the string begins with "red" or "blue" return that color string,
	//			otherwise return the empty string.

	//	seeColor("redxx") → "red"
	//	seeColor("xxred") → ""
	//	seeColor("blueTimes") → "blue"
	public String seeColor(String str) {
		// red/blueで始まる場合、それぞれred/blueの文字列を返す
		if(str.startsWith("red")){
			return "red";
		}else if(str.startsWith("blue")){
			return "blue";
		}
		return "";
	}
	//	Given a string, return true if the first 2 chars in the string also appear
	//	at the end of the string, such as with "edited".
	//
	//	frontAgain("edited") → true
	//	frontAgain("edit") → false
	//	frontAgain("ed") → true
	public boolean frontAgain(String str) {
		// 2文字より短い場合はstrを返す
		if(str.length() < 2){return false;};
		// 先頭2文字を抽出し、抽出した先頭2文字と同じ文字列があった場合、trueを返す
		if(str.substring(0, 2).equals(str.substring(str.length()-2))){
			return true;
		}
		return false;
	}

	// Given two strings, append them together (known as "concatenation") and return the result.
	// However, if the strings are different lengths, omit chars from the longer string
	// so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
	//
	// minCat("Hello", "Hi") → "loHi"
	// minCat("Hello", "java") → "ellojava"
	// minCat("java", "Hello") → "javaello"
	public String minCat(String a, String b) {
		String result = "";
		int dif = 0;
		// aとbの文字数を比較し、少ない方を基準とする
		if(a.length() > b.length()){
			dif = a.length() - b.length();
			result = a.substring(dif) + b;
		}else if(a.length() < b.length()){
			dif = b.length() - a.length();
			result = a + b.substring(dif);
		}
		return result;
	}

	//	Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
	//	The string may be any length. If there are fewer than 2 chars, use whatever is there.
	//
	//	extraFront("Hello") → "HeHeHe"
	//	extraFront("ab") → "ababab"
	//	extraFront("H") → "HHH"
	public String extraFront(String str) {
		// strが2文字以下の場合、strを3回結合する
		String result = "";
		int count = 0;
		if(str.length()<=2){
			while(count <3){
				result = result + str;
				count++;
			}
		}
		// strが3文字以上の場合、先頭2文字を抽出して3回結合する
		if(str.length() >=3){
			while(count <3){
				result = result + str.substring(0, 2);
				count++;
			}
		}
		return result;
	}

	// Given a string, if a length 2 substring appears at both its beginning and end,
	// return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
	// The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
	//
	//
	// without2("HelloHe") → "lloHe"
	// without2("HelloHi") → "HelloHi"
	// without2("Hi") → ""
	public String without2(String str) {
		// strが1文字の場合はそのまま返す
		if(str.length() == 1){return str;};
		// strが2文字以下の場合は空文字を返す
		if(str.length()<=2){return "";};
		// 先頭2文字と後方2文字が同じ場合、先頭2文字を抜かして返す
		if(str.substring(0, 2).equals(str.substring(str.length()-2))){
			return str.substring(2);
		}
		return str;
	}

	// Given a string, return a version without the first 2 chars.
	// Except keep the first char if it is 'a' and keep the second char if it is 'b'.
	// The string may be any length. Harder than it looks.
	//
	// deFront("Hello") → "llo"
	// deFront("java") → "va"
	// deFront("away") → "aay"
	public String deFront(String str) {
		// strがa,2文字目がbから始まっている場合
		if(str.startsWith("a") && str.substring(1,2).equals("b")){
			return str;
		}else if(str.startsWith("a")){
			return str.substring(0,1) + str.substring(2);
		}else if(str.substring(1,2).equals("b")){
			return str.substring(1);
		}
		return str.substring(2);
	}

	//  Given a string and a second "word" string, we'll say that the word matches the string
	//  if it appears at the front of the string, except its first char does not need to match exactly.
	//  On a match, return the front of the string, or otherwise return the empty string.
	//	So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
	//	The word will be at least length 1.

	//	startWord("hippo", "hi") → "hi"
	//	startWord("hippo", "xip") → "hip"
	//	startWord("hippo", "i") → "h"
	public String startWord(String str, String word) {
		if (word.length() > str.length()) return "";
		if (str.substring(0, word.length()).equals(word)) return word;
		if (str.substring(1, word.length()).equals(word.substring(1)))
			return str.charAt(0) + word.substring(1);
		return "";
	}


	// Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
	// and otherwise return the string unchanged.
	//
	// withoutX("xHix") → "Hi"
	// withoutX("xHi") → "Hi"
	// withoutX("Hxix") → "Hxi"
	public String withoutX(String str) {
		if(str.length()<=1){
			if(str.startsWith("x")){return "";}
			else{return str;}
		}
		// 先頭の文字と後方の文字がともに"x"だった場合、xを除いた数を返す
		if(str.startsWith("x") && str.endsWith("x")){
			return str.substring(1, str.length()-1);
		}else if(str.startsWith("x")){
			return str.substring(1);
		}else if(str.endsWith("x")){
			return str.substring(0,str.length()-1);
		}
		return str;
	}

	//	Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
	//	and otherwise return the string unchanged. This is a little harder than it looks.

	//	withoutX2("xHi") → "Hi"
	//	withoutX2("Hxi") → "Hi"
	//	withoutX2("Hi") → "Hi"
	public String withoutX2(String str) {
		// strが2文字より短い場合、そのまま返す
		if(str.length() <2){return "";};
		// 1文字目、もしくは2文字目に"x"があった場合、"x"を除いて返す
		if(str.startsWith("x") && str.substring(1,2).equals("x")){
			return str.substring(2);
		}else if(str.startsWith("x")){
			return str.substring(1);
		}else if(str.substring(1,2).equals("x")){
			return str.substring(0,1) + str.substring(2);
		}
		return str;
	}
}
