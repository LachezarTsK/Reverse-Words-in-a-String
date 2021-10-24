

/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function (s) {


    let start = s.length;
    let end = 0;
    let reversed = "";

    while (start !== end) {

        end = --start;
        while (end >= 0 && s.charAt(end) === " ") {
            end--;
        }

        start = end;
        while (start >= 0 && s.charAt(start) !== " ") {
            start--;
        }

        reversed += s.substring(++start, ++end) + " ";
    }

    return reversed.trim();
};
