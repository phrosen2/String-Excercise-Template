# PA13: Basic String Exercises

## Description/Instructions

The goal of this assignment is to start practicing using the String methods
that can be found at the Quick Reference Document.

**You need to fill out each method and follow instructions exactly.
For this project, I am no longer walking you through how to test each method,
that is up to you.**

If you got everything copy-pasted correctly, it should look like this when you
run it:

```
<terminated> PA23 [Java Application] C:\Users\tmenghini\Documents
makeAbba prints: null
```

---

## Example Inputs/Returns

### Method: makeAbba

| Test Case Name | String a | String b | Expected Return Value |
|----------------|----------|----------|-----------------------|
| makeAbba1      | "Hi"     | "Bye"    | "HiByeByeHi"          |
| makeAbba2      | "Yo"     | "Alice"  | "YoAliceAliceYo"      |
| makeAbba3      | "What"   | "Up"     | "WhatUpUpWhat"        |
| makeAbba4      | "aaa"    | "bbb"    | "aaabbbbbbaaa"        |
| makeAbba5      | "x"      | "y"      | "xyyx"                |
| makeAbba6      | "x"      | ""       | "xx"                  |
| makeAbba7      | ""       | "y"      | "yy"                  |
| makeAbba8      | "Bo"     | "Ya"     | "BoYaYaBo"            |
| makeAbba9      | "Ya"     | "Ya"     | "YaYaYaYa"            |

---

### Method: makeTags

| Test Case Name | String tag  | String word | Expected Return Value     |
|----------------|-------------|-------------|---------------------------|
| makeTags1      | "i"         | "Yay"       | "\<i>Yay\</i>"            |
| makeTags2      | "i"         | "Hello"     | "\<i>Hello\</i>"          |
| makeTags3      | "cite"      | "Yay"       | "\<cite>Yay\</cite>"      |
| makeTags4      | "address"   | "here"      | "\<address>here\</address>"|
| makeTags5      | "body"      | "Heart"     | "\<body>Heart\</body>"    |
| makeTags6      | "i"         | "i"         | "\<i>i\</i>"              |
| makeTags7      | "i"         | ""          | "\<i>\</i>"               |

---

### Method: comboString

| Test Case Name | String a  | String b  | Expected Return Value |
|----------------|-----------|-----------|-----------------------|
| comboString1   | "Hello"   | "hi"      | "hiHellohi"           |
| comboString2   | "hi"      | "Hello"   | "hiHellohi"           |
| comboString3   | "aaa"     | "b"       | "baaab"               |
| comboString4   | "b"       | "aaa"     | "baaab"               |
| comboString5   | "aaa"     | ""        | "aaa"                 |
| comboString6   | ""        | "bb"      | "bb"                  |
| comboString7   | "aaa"     | "1234"    | "aaa1234aaa"          |
| comboString8   | "aaa"     | "bb"      | "bbaaabb"             |
| comboString9   | "a"       | "bb"      | "abba"                |
| comboString10  | "bb"      | "a"       | "abba"                |
| comboString11  | "xyz"     | "ab"      | "abxyzab"             |

---

### Method: atFirst

| Test Case Name | String str | Expected Return Value |
|----------------|------------|-----------------------|
| atFirst1       | "hello"    | "he"                  |
| atFirst2       | "hi"       | "hi"                  |
| atFirst3       | "h"        | "h@"                  |
| atFirst4       | ""         | "@@"                  |
| atFirst5       | "kitten"   | "ki"                  |
| atFirst6       | "java"     | "ja"                  |
| atFirst7       | "j"        | "j@"                  |

---

### Method: frontAgain

| Test Case Name | String str | Expected Return Value |
|----------------|------------|-----------------------|
| frontAgain1    | "edited"   | true                  |
| frontAgain2    | "edit"     | false                 |
| frontAgain3    | "ed"       | true                  |
| frontAgain4    | "jj"       | true                  |
| frontAgain5    | "jjj"      | true                  |
| frontAgain6    | "jjjj"     | true                  |
| frontAgain7    | "jjjk"     | false                 |
| frontAgain8    | "x"        | false                 |
| frontAgain9    | ""         | false                 |
| frontAgain10   | "java"     | false                 |
| frontAgain11   | "javaja"   | true                  |

---

### Method: without2

| Test Case Name | String str   | Expected Return Value |
|----------------|--------------|-----------------------|
| without21      | "HelloHe"    | "lloHe"               |
| without22      | "HelloHi"    | "HelloHi"             |
| without23      | "Hi"         | ""                    |
| without24      | "Chocolate"  | "Chocolate"           |
| without25      | "xxx"        | "x"                   |
| without26      | "xx"         | ""                    |
| without27      | "x"          | "x"                   |
| without28      | ""           | ""                    |
| without29      | "Fruits"     | "Fruits"              |

---

### Method: doubleChar

| Test Case Name | String str   | Expected Return Value    |
|----------------|--------------|--------------------------|
| doubleChar1    | "The"        | "TThhee"                 |
| doubleChar2    | "AAbb"       | "AAAAbbbb"               |
| doubleChar3    | "Hi-There"   | "HHii--TThheerree"       |
| doubleChar4    | "Word!"      | "WWoorrdd!!"             |
| doubleChar5    | "! "         | "!!  "                   |
| doubleChar6    | ""           | ""                       |
| doubleChar7    | "a"          | "aa"                     |
| doubleChar8    | ". "         | "..  "                   |
| doubleChar9    | "aa"         | "aaaa"                   |

---

### Method: countHi

| Test Case Name | String str            | Expected Return Value |
|----------------|-----------------------|-----------------------|
| countHi1       | "abc hi ho"           | 1                     |
| countHi2       | "ABChi hi"            | 2                     |
| countHi3       | "hihi"                | 2                     |
| countHi4       | "hiHIhi"              | 2                     |
| countHi5       | ""                    | 0                     |
| countHi6       | "h"                   | 0                     |
| countHi7       | "hi"                  | 1                     |
| countHi8       | "Hi is no HI on ahI"  | 0                     |
| countHi9       | "hiho not HOHIhi"     | 2                     |

---

### Method: xyBalance

| Test Case Name | String str     | Expected Return Value |
|----------------|----------------|-----------------------|
| xyBalance1     | "aaxbby"       | true                  |
| xyBalance2     | "aaxbb"        | false                 |
| xyBalance3     | "yaaxbb"       | false                 |
| xyBalance4     | "yaaxbby"      | true                  |
| xyBalance5     | ""             | true                  |
| xyBalance6     | "xxbxy"        | true                  |
| xyBalance7     | "hi"           | true                  |
| xyBalance8     | "y"            | true                  |
| xyBalance9     | "yyxyxyxyx"    | false                 |

---

## How to Submit

TODO: Explain how to submit using github classroom.

## Grading Criteria

Tests as above.
