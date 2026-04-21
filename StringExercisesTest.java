import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringExercisesTest {

    // ---------------- makeAbba ----------------

    @Test void makeAbba1() { assertEquals("HiByeByeHi", StringExercises.makeAbba("Hi", "Bye")); }
    @Test void makeAbba2() { assertEquals("YoAliceAliceYo", StringExercises.makeAbba("Yo", "Alice")); }
    @Test void makeAbba3() { assertEquals("WhatUpUpWhat", StringExercises.makeAbba("What", "Up")); }
    @Test void makeAbba4() { assertEquals("aaabbbbbbaaa", StringExercises.makeAbba("aaa", "bbb")); }
    @Test void makeAbba5() { assertEquals("xyyx", StringExercises.makeAbba("x", "y")); }
    @Test void makeAbba6() { assertEquals("xx", StringExercises.makeAbba("x", "")); }
    @Test void makeAbba7() { assertEquals("yy", StringExercises.makeAbba("", "y")); }
    @Test void makeAbba8() { assertEquals("BoYaYaBo", StringExercises.makeAbba("Bo", "Ya")); }
    @Test void makeAbba9() { assertEquals("YaYaYaYa", StringExercises.makeAbba("Ya", "Ya")); }

    // ---------------- makeTags ----------------

    @Test void makeTags1() { assertEquals("<i>Yay</i>", StringExercises.makeTags("i", "Yay")); }
    @Test void makeTags2() { assertEquals("<i>Hello</i>", StringExercises.makeTags("i", "Hello")); }
    @Test void makeTags3() { assertEquals("<cite>Yay</cite>", StringExercises.makeTags("cite", "Yay")); }
    @Test void makeTags4() { assertEquals("<address>here</address>", StringExercises.makeTags("address", "here")); }
    @Test void makeTags5() { assertEquals("<body>Heart</body>", StringExercises.makeTags("body", "Heart")); }
    @Test void makeTags6() { assertEquals("<i>i</i>", StringExercises.makeTags("i", "i")); }
    @Test void makeTags7() { assertEquals("<i></i>", StringExercises.makeTags("i", "")); }

    // ---------------- comboString ----------------

    @Test void comboString1() { assertEquals("hiHellohi", StringExercises.comboString("Hello", "hi")); }
    @Test void comboString2() { assertEquals("hiHellohi", StringExercises.comboString("hi", "Hello")); }
    @Test void comboString3() { assertEquals("baaab", StringExercises.comboString("aaa", "b")); }
    @Test void comboString4() { assertEquals("baaab", StringExercises.comboString("b", "aaa")); }
    @Test void comboString5() { assertEquals("aaa", StringExercises.comboString("aaa", "")); }
    @Test void comboString6() { assertEquals("bb", StringExercises.comboString("", "bb")); }
    @Test void comboString7() { assertEquals("aaa1234aaa", StringExercises.comboString("aaa", "1234")); }
    @Test void comboString8() { assertEquals("bbaaabb", StringExercises.comboString("aaa", "bb")); }
    @Test void comboString9() { assertEquals("abba", StringExercises.comboString("a", "bb")); }
    @Test void comboString10() { assertEquals("abba", StringExercises.comboString("bb", "a")); }
    @Test void comboString11() { assertEquals("abxyzab", StringExercises.comboString("xyz", "ab")); }

    // ---------------- atFirst ----------------

    @Test void atFirst1() { assertEquals("he", StringExercises.atFirst("hello")); }
    @Test void atFirst2() { assertEquals("hi", StringExercises.atFirst("hi")); }
    @Test void atFirst3() { assertEquals("h@", StringExercises.atFirst("h")); }
    @Test void atFirst4() { assertEquals("@@", StringExercises.atFirst("")); }
    @Test void atFirst5() { assertEquals("ki", StringExercises.atFirst("kitten")); }
    @Test void atFirst6() { assertEquals("ja", StringExercises.atFirst("java")); }
    @Test void atFirst7() { assertEquals("j@", StringExercises.atFirst("j")); }

    // ---------------- frontAgain ----------------

    @Test void frontAgain1() { assertTrue(StringExercises.frontAgain("edited")); }
    @Test void frontAgain2() { assertFalse(StringExercises.frontAgain("edit")); }
    @Test void frontAgain3() { assertTrue(StringExercises.frontAgain("ed")); }
    @Test void frontAgain4() { assertTrue(StringExercises.frontAgain("jj")); }
    @Test void frontAgain5() { assertTrue(StringExercises.frontAgain("jjj")); }
    @Test void frontAgain6() { assertTrue(StringExercises.frontAgain("jjjj")); }
    @Test void frontAgain7() { assertFalse(StringExercises.frontAgain("jjjk")); }
    @Test void frontAgain8() { assertFalse(StringExercises.frontAgain("x")); }
    @Test void frontAgain9() { assertFalse(StringExercises.frontAgain("")); }
    @Test void frontAgain10() { assertFalse(StringExercises.frontAgain("java")); }
    @Test void frontAgain11() { assertTrue(StringExercises.frontAgain("javaja")); }

    // ---------------- without2 ----------------

    @Test void without21() { assertEquals("lloHe", StringExercises.without2("HelloHe")); }
    @Test void without22() { assertEquals("HelloHi", StringExercises.without2("HelloHi")); }
    @Test void without23() { assertEquals("", StringExercises.without2("Hi")); }
    @Test void without24() { assertEquals("Chocolate", StringExercises.without2("Chocolate")); }
    @Test void without25() { assertEquals("x", StringExercises.without2("xxx")); }
    @Test void without26() { assertEquals("", StringExercises.without2("xx")); }
    @Test void without27() { assertEquals("x", StringExercises.without2("x")); }
    @Test void without28() { assertEquals("", StringExercises.without2("")); }
    @Test void without29() { assertEquals("Fruits", StringExercises.without2("Fruits")); }

    // ---------------- doubleChar ----------------

    @Test void doubleChar1() { assertEquals("TThhee", StringExercises.doubleChar("The")); }
    @Test void doubleChar2() { assertEquals("AAAAbbbb", StringExercises.doubleChar("AAbb")); }
    @Test void doubleChar3() { assertEquals("HHii--TThheerree", StringExercises.doubleChar("Hi-There")); }
    @Test void doubleChar4() { assertEquals("WWoorrdd!!", StringExercises.doubleChar("Word!")); }
    @Test void doubleChar5() { assertEquals("!!!!", StringExercises.doubleChar("!!")); }
    @Test void doubleChar6() { assertEquals("", StringExercises.doubleChar("")); }
    @Test void doubleChar7() { assertEquals("aa", StringExercises.doubleChar("a")); }
    @Test void doubleChar8() { assertEquals("..", StringExercises.doubleChar(".")); }
    @Test void doubleChar9() { assertEquals("aaaa", StringExercises.doubleChar("aa")); }

    // ---------------- countHi ----------------

    @Test void countHi1() { assertEquals(1, StringExercises.countHi("abc hi ho")); }
    @Test void countHi2() { assertEquals(2, StringExercises.countHi("ABChi hi")); }
    @Test void countHi3() { assertEquals(2, StringExercises.countHi("hihi")); }
    @Test void countHi4() { assertEquals(2, StringExercises.countHi("hiHIhi")); }
    @Test void countHi5() { assertEquals(0, StringExercises.countHi("")); }
    @Test void countHi6() { assertEquals(0, StringExercises.countHi("h")); }
    @Test void countHi7() { assertEquals(1, StringExercises.countHi("hi")); }
    @Test void countHi8() { assertEquals(0, StringExercises.countHi("Hi is no HI on ahI")); }
    @Test void countHi9() { assertEquals(2, StringExercises.countHi("hiho not HOHIhi")); }

    // ---------------- xyBalance ----------------

    @Test void xyBalance1() { assertTrue(StringExercises.xyBalance("aaxbby")); }
    @Test void xyBalance2() { assertFalse(StringExercises.xyBalance("aaxbb")); }
    @Test void xyBalance3() { assertFalse(StringExercises.xyBalance("yaaxbb")); }
    @Test void xyBalance4() { assertTrue(StringExercises.xyBalance("yaaxbby")); }
    @Test void xyBalance5() { assertTrue(StringExercises.xyBalance("")); }
    @Test void xyBalance6() { assertTrue(StringExercises.xyBalance("xxbxy")); }
    @Test void xyBalance7() { assertTrue(StringExercises.xyBalance("hi")); }
    @Test void xyBalance8() { assertTrue(StringExercises.xyBalance("y")); }
    @Test void xyBalance9() { assertFalse(StringExercises.xyBalance("yyxyxyxyx")); }
}
