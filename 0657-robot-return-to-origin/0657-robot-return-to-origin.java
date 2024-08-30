class Solution {
    public boolean judgeCircle(String moves) {
        int i = 0, j = 0;
        char ch[] = moves.toCharArray();
        for(int k = 0; k < ch.length; k++) {
            switch(ch[k]) {
                case 'U':
                    i--;
                    break;
                case 'D':
                    i++;
                    break;
                case 'L':
                    j++;
                    break;
                default:
                    j--;
            }
        }
        return (i == 0 && j == 0);
    }
}

// class Solution {
//     public boolean judgeCircle(String moves) {
//         int i = 0, j = 0;
//         for(int k = 0; k < moves.length(); k++) {
//             switch(moves.charAt(k)) {
//                 case 'U':
//                     i--;
//                     break;
//                 case 'D':
//                     i++;
//                     break;
//                 case 'L':
//                     j++;
//                     break;
//                 default:
//                     j--;
//             }
//         }
//         return (i == 0 && j == 0);
//     }
// }

// class Solution {
//     public boolean judgeCircle(String moves) {
//         int i = 0, j = 0;
//         for(int k = 0; k < moves.length(); k++) {
//             char ch = moves.charAt(k);
//             if(ch == 'R')   j++;
//             else if(ch == 'L')  j--;
//             else if(ch == 'U')  i--;
//             else i++;
//         }
//         return (i == 0 && j == 0);
//     }
// }