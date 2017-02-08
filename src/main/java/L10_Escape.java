/**
 * Created by azmiks on 07/02/2017.
 */
public class L10_Escape {
    public static void main (String[] args)
    {
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
\n - new feed (перевод строки)
\t - tabbing (табуляция)
\b - step back (шаг назад)
\r - carriage return (возврат каретки)
\f - page feed (перевод страницы)
\\ - inverse slash (обратный слеш)
\' - apostrophe (одиночная кавычка)
\" - quotation mark (двойная кавычка)
*/