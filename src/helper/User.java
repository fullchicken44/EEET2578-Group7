//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.7
//
// <auto-generated>
//
// Generated from file `Helper.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package helper;

public class User implements java.lang.Cloneable,
                             java.io.Serializable
{
    public int medicalConditionType;

    public int[] tempThreshholds;

    public int apoThreshhold;

    public int clock;

    public SensorData sensorData;

    public int weather;

    public boolean apoReached;

    public boolean tempReached;

    public User()
    {
        this.sensorData = new SensorData();
    }

    public User(int medicalConditionType, int[] tempThreshholds, int apoThreshhold, int clock, SensorData sensorData, int weather, boolean apoReached, boolean tempReached)
    {
        this.medicalConditionType = medicalConditionType;
        this.tempThreshholds = tempThreshholds;
        this.apoThreshhold = apoThreshhold;
        this.clock = clock;
        this.sensorData = sensorData;
        this.weather = weather;
        this.apoReached = apoReached;
        this.tempReached = tempReached;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        User r = null;
        if(rhs instanceof User)
        {
            r = (User)rhs;
        }

        if(r != null)
        {
            if(this.medicalConditionType != r.medicalConditionType)
            {
                return false;
            }
            if(!java.util.Arrays.equals(this.tempThreshholds, r.tempThreshholds))
            {
                return false;
            }
            if(this.apoThreshhold != r.apoThreshhold)
            {
                return false;
            }
            if(this.clock != r.clock)
            {
                return false;
            }
            if(this.sensorData != r.sensorData)
            {
                if(this.sensorData == null || r.sensorData == null || !this.sensorData.equals(r.sensorData))
                {
                    return false;
                }
            }
            if(this.weather != r.weather)
            {
                return false;
            }
            if(this.apoReached != r.apoReached)
            {
                return false;
            }
            if(this.tempReached != r.tempReached)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::helper::User");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, medicalConditionType);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, tempThreshholds);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, apoThreshhold);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, clock);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, sensorData);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, weather);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, apoReached);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, tempReached);
        return h_;
    }

    public User clone()
    {
        User c = null;
        try
        {
            c = (User)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeInt(this.medicalConditionType);
        ostr.writeIntSeq(this.tempThreshholds);
        ostr.writeInt(this.apoThreshhold);
        ostr.writeInt(this.clock);
        SensorData.ice_write(ostr, this.sensorData);
        ostr.writeInt(this.weather);
        ostr.writeBool(this.apoReached);
        ostr.writeBool(this.tempReached);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.medicalConditionType = istr.readInt();
        this.tempThreshholds = istr.readIntSeq();
        this.apoThreshhold = istr.readInt();
        this.clock = istr.readInt();
        this.sensorData = SensorData.ice_read(istr);
        this.weather = istr.readInt();
        this.apoReached = istr.readBool();
        this.tempReached = istr.readBool();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, User v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public User ice_read(com.zeroc.Ice.InputStream istr)
    {
        User v = new User();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<User> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, User v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<User> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(User.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final User _nullMarshalValue = new User();

    /** @hidden */
    public static final long serialVersionUID = 1772940626637899353L;
}
