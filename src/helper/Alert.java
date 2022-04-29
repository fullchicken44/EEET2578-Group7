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

public class Alert implements java.lang.Cloneable,
                              java.io.Serializable
{
    public String type;

    public int value;

    public String[] locations;

    public Alert()
    {
        this.type = "";
    }

    public Alert(String type, int value, String[] locations)
    {
        this.type = type;
        this.value = value;
        this.locations = locations;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Alert r = null;
        if(rhs instanceof Alert)
        {
            r = (Alert)rhs;
        }

        if(r != null)
        {
            if(this.type != r.type)
            {
                if(this.type == null || r.type == null || !this.type.equals(r.type))
                {
                    return false;
                }
            }
            if(this.value != r.value)
            {
                return false;
            }
            if(!java.util.Arrays.equals(this.locations, r.locations))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::helper::Alert");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, type);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, value);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, locations);
        return h_;
    }

    public Alert clone()
    {
        Alert c = null;
        try
        {
            c = (Alert)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.type);
        ostr.writeInt(this.value);
        ostr.writeStringSeq(this.locations);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.type = istr.readString();
        this.value = istr.readInt();
        this.locations = istr.readStringSeq();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, Alert v)
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

    static public Alert ice_read(com.zeroc.Ice.InputStream istr)
    {
        Alert v = new Alert();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<Alert> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, Alert v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<Alert> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(Alert.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final Alert _nullMarshalValue = new Alert();

    /** @hidden */
    public static final long serialVersionUID = -5172486807302146759L;
}
