#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <cctype>

using namespace std;

void separateAndPrintLetters(const string& input) {
    string upperCase;
    string lowerCase;

    for (char c : input) {
        if (isupper(c)) {
            upperCase += c;
        } else if (islower(c)) {
            lowerCase += c;
        }
    }

    cout << "Заглавные: " << upperCase << endl;
    cout << "Строчные: " << lowerCase << endl;
}

int main() {
    // Вызываем функцию с примером строки
    separateAndPrintLetters("HeLLoWoRLD");
    
    return 0;
}
