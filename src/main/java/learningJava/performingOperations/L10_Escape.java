package learningJava.performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L10_Escape {
    public static void main (String[] args) {
        String header = "\n\tGdansk weather forecast:\n";
        header += "\n\tDay\t\tMax\tMin\tPrecipitations\n";
        header += "\n\t-------\t---\t---\t--------------\n";

        String forecast = "\tSunday\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t69F\t57F\tSunny\n";
        forecast += "\tTuesday\t65F\t41F\tRainy\n";

        String test = "My nickname is 'something'.";

        System.out.println(header + forecast);

        System.out.print("" + "\n");
        System.out.println("");
    }
}

/*
\n - newline (перевод строки)
\t - tab (табуляция)
\b - backspace (шаг назад)
\r - carriage return (возврат каретки)
\f - formfeed (перевод страницы)
\s - space (пробел)
\\ - backslash (обратный слеш)
\' - single quote (одиночная кавычка)
\" - double quote (двойная кавычка)
*/