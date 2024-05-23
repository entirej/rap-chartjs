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
    private Integer scaleMin;
    private Integer scaleMax;
    private Integer scaleStep;

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

    public Integer getScaleMin()
    {
        return scaleMin;
    }

    public void setScaleMin(Integer scaleMin)
    {
        this.scaleMin = scaleMin;
    }

    public Integer getScaleMax()
    {
        return scaleMax;
    }

    public void setScaleMax(Integer scaleMax)
    {
        this.scaleMax = scaleMax;
    }

    public Integer getScaleStep()
    {
        return scaleStep;
    }

    public void setScaleStep(Integer scaleStep)
    {
        this.scaleStep = scaleStep;
    }

}
