package students.jelena_kaverska.lesson_10.level_4.task_11_12;

class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}