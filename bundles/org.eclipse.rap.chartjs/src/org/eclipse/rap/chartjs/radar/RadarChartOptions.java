package org.eclipse.rap.chartjs.radar;

import org.eclipse.rap.chartjs.AbstarctChartOptions;
import org.eclipse.rap.chartjs.Axis;
import org.eclipse.rap.json.JsonArray;
import org.eclipse.rap.json.JsonObject;

/**
 * @author anuradhagunasekara
 *
 */
public class RadarChartOptions extends AbstarctChartOptions
{
    private Float scaleMin;
    private Float scaleMax;
    private Float scaleStep;

    public RadarChartOptions()
    {

    }

    @Override
    public JsonObject toJson()
    {
        JsonObject jsonObject = super.toJson();
        JsonObject r = new JsonObject();
        jsonObject.add("scales", new JsonObject().add("r", r));

        if (scaleMin != null)
        {
            r.add("min", scaleMin.intValue());
        }
        if (scaleMax != null)
        {
            r.add("max", scaleMax.intValue());
        }
        JsonObject ticks = new JsonObject();
        r.add("ticks", ticks);
        if (scaleStep != null)
        {
            r.add("stepSize", scaleStep.intValue());
        }
        return jsonObject;
    }

    public Float getScaleMin()
    {
        return scaleMin;
    }

    public void setScaleMin(Float scaleMin)
    {
        this.scaleMin = scaleMin;
    }

    public Float getScaleMax()
    {
        return scaleMax;
    }

    public void setScaleMax(Float scaleMax)
    {
        this.scaleMax = scaleMax;
    }

    public Float getScaleStep()
    {
        return scaleStep;
    }

    public void setScaleStep(Float scaleStep)
    {
        this.scaleStep = scaleStep;
    }

}
