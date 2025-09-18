#include <iostream>
#include <vector>
#include <string>
#include <cctype> // для isdigit() и isalpha()

using namespace std;

void separateLettersAndDigits(const vector<string>& inputList) {
    vector<string> letters;
    vector<string> digits;

    for (const auto& s : inputList) {
        if (s.empty()) continue; // Пропускаем пустые строки

        char c = s[0]; // Берем первый символ строки

        if (isalpha(c)) {
            letters.push_back(s);
        } else if (isdigit(c)) {
            digits.push_back(s);
        }
    }

    // Выводим результаты
    cout << "Буквы: ";
    for (const auto& letter : letters) {
        cout << letter << " ";
    }
    cout << endl;

    cout << "Цифры: ";
    for (const auto& digit : digits) {
        cout << digit << " ";
    }
    cout << endl;
}

int main() {
    // Пример использования
    vector<string> input = {"a", "1", "b", "2", "c", "3"};
    separateLettersAndDigits(input);

    return 0;
}