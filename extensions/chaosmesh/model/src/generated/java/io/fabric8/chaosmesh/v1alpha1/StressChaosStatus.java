
package io.fabric8.chaosmesh.v1alpha1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "experiment",
    "failedMessage",
    "instances",
    "scheduler"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
public class StressChaosStatus implements KubernetesResource
{

    @JsonProperty("experiment")
    private ExperimentStatus experiment;
    @JsonProperty("failedMessage")
    private java.lang.String failedMessage;
    @JsonProperty("instances")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, StressInstance> instances = new LinkedHashMap<String, StressInstance>();
    @JsonProperty("scheduler")
    private ScheduleStatus scheduler;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StressChaosStatus() {
    }

    /**
     * 
     * @param scheduler
     * @param experiment
     * @param instances
     * @param failedMessage
     */
    public StressChaosStatus(ExperimentStatus experiment, java.lang.String failedMessage, Map<String, StressInstance> instances, ScheduleStatus scheduler) {
        super();
        this.experiment = experiment;
        this.failedMessage = failedMessage;
        this.instances = instances;
        this.scheduler = scheduler;
    }

    @JsonProperty("experiment")
    public ExperimentStatus getExperiment() {
        return experiment;
    }

    @JsonProperty("experiment")
    public void setExperiment(ExperimentStatus experiment) {
        this.experiment = experiment;
    }

    @JsonProperty("failedMessage")
    public java.lang.String getFailedMessage() {
        return failedMessage;
    }

    @JsonProperty("failedMessage")
    public void setFailedMessage(java.lang.String failedMessage) {
        this.failedMessage = failedMessage;
    }

    @JsonProperty("instances")
    public Map<String, StressInstance> getInstances() {
        return instances;
    }

    @JsonProperty("instances")
    public void setInstances(Map<String, StressInstance> instances) {
        this.instances = instances;
    }

    @JsonProperty("scheduler")
    public ScheduleStatus getScheduler() {
        return scheduler;
    }

    @JsonProperty("scheduler")
    public void setScheduler(ScheduleStatus scheduler) {
        this.scheduler = scheduler;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}