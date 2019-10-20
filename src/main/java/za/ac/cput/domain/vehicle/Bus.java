package za.ac.cput.domain.vehicle;

import javax.persistence.Entity;

@Entity
public class Bus {

    private String id;

    private String brandName;
    private String modelNo;
    private int quantity;
    private String roadWorthy;
    private int engineNumber;
    private String busId;

    private Bus(){}


    private Bus(Builder builder)
    {

        this.brandName =builder.brandName;
        this.engineNumber =builder.engineNumber;
        this.modelNo = builder.modelNo;
        this.quantity =builder.quantity;
        this.roadWorthy =builder.roadWorthy;
        this.busId =builder.busId;
    }




    public String getBrandName() {
        return brandName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public String getModelNo() {
        return modelNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBusId() {
        return busId;
    }

    public String getRoadWorthy() {
        return roadWorthy;
    }



    public static class Builder{


        private String brandName;
        private int engineNumber;
        private String modelNo;
        private int quantity;
        private String roadWorthy;
        private String busId;



        public Builder brandName(String brandName)
        {
            this.brandName =brandName;
            return  this;
        }

        public Builder setBusId(String busId)
        {
            this.busId = busId;
            return this;
        }

        public Builder engineNumber(int engineNumber)
        {
            this.engineNumber =engineNumber;
            return  this;
        }

        public Builder modelNo(String modelNo)
        {
            this.modelNo =modelNo;
            return  this;
        }

        public Builder quantity(int quantity)
        {
            this.quantity =quantity;
            return  this;
        }

        public Builder roadWorty(String roadWorthy)
        {
            this.roadWorthy =roadWorthy;
            return  this;
        }

        public Builder copy(Bus bus){

            this.brandName =bus.brandName;
            this.engineNumber =bus.engineNumber;
            this.modelNo =bus.modelNo;
            this.quantity =bus.quantity;
            this.roadWorthy =bus.roadWorthy;
            this.busId =bus.busId;

            return this;
        }

        public Bus build()
        {
            return new Bus(this);
        }


    }

    @Override
    public String toString() {
        return "Bus{" +

                ", brandName='" + brandName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", quantity=" + quantity +
                ", roadWorthy='" + roadWorthy + '\'' +
                ", engineNumber=" + engineNumber +
                '}';
    }
}
