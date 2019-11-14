import java.lang.Math;

class Darts {

    int score;

    Darts(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        if (r <= 10 && r > 5) {
            score = 1;
        }
        else if (r <= 5 && r > 1) {
            score = 5;
        }
        else if (r <= 1) {
            score = 10;
        }
        else{
        score = 0;}

    }

    int score() {
        return score;

    }
}
