/**
 Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number(
  A proper divisor of a number is a positive factor of that number other than the number itself. For example, the proper divisors of 12 are 1, 2, 3, 4 and 6).

  Implement the function findAmicablePairs(Int N) that receives a number and returns a count of unique amicable number pairs where at least one number is
  from 1 to N, where 1 <= N <= 20000

  Example of amicable pair:
  220 and 284
  // 220 proper divisors sum: 1+2+4+5+10+11+20+22+44+55+110=284
  // 284 proper divisors sum: 1+2+4+71+142=220

  Note, that pair of 2 same perfect numbers are NOT amicable (e.g. 28 is a perfect number, 28 = 1 + 2 + 4 + 7 + 14)

  Example:
  findAmicablePairs(230) // should return 1 (220, 284)

  findAmicablePairs(10) => 0
  findAmicablePairs(230) => 1 // (220, 284)
  findAmicablePairs(6000) => 4 // plus (1184, 1210), (2620, 2924), (5020, 5564)
  findAmicablePairs(10000) => 5 // plus (6232, 6368)
  findAmicablePairs(20000) => 8 // plus (10744, 10856), (12285, 14595), (17296, 18416)
 **/
public class AmicablePairs {
    public static void main(String[] args) {
        System.out.println(findAmicablePairs(10)); //0
        System.out.println(findAmicablePairs(230)); //1
        System.out.println(findAmicablePairs(6000)); //4
        System.out.println(findAmicablePairs(10000)); //5
        System.out.println(findAmicablePairs(20000)); //8
    }

    private static int findAmicablePairs(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (!isPrime(i)) {
                int sumDivisors = getDivisors(i);
                if (getDivisors(sumDivisors) == i && i != sumDivisors) {
                    count++;
                    if (sumDivisors > num) {
                        count++;
                    }
                }
            }
        }
        return count / 2;
    }

    private static int getDivisors(int num) {
        int sum = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        sum += 1;
        return sum;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}