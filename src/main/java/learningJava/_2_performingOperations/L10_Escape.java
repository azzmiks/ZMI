package learningJava._2_performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L10_Escape {
    public void escapingLiterals() {
        String header = "\n\tGdansk weather forecast:\n";
        header += "\n\tDay\t\tMax\tMin\tPrecipitations\n";
        header += "\n\t-------\t---\t---\t--------------\n";

        String forecast = "\tSunday\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t69F\t57F\tSunny\n";
        forecast += "\tTuesday\t65F\t41F\tRainy\n";

        System.out.println(header + forecast);
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