/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 10:21 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.oncrpc4j.rpc.OncRpcException;
import org.dcache.oncrpc4j.xdr.XdrAble;
import org.dcache.oncrpc4j.xdr.XdrDecodingStream;
import org.dcache.oncrpc4j.xdr.XdrEncodingStream;
import java.io.IOException;
import org.dcache.nfs.v4.xdr.netaddr4;
import org.dcache.nfs.v4.xdr.nfs_fh4;
import org.dcache.nfs.v4.xdr.nfstime4;

public class ff_layoutupdate4 implements XdrAble, java.io.Serializable {
    public netaddr4 ffl_addr;
    public nfs_fh4 ffl_fhandle;
    public ff_io_latency4 ffl_read;
    public ff_io_latency4 ffl_write;
    public nfstime4 ffl_duration;
    public boolean ffl_local;

    private static final long serialVersionUID = 7916998994578483964L;

    public ff_layoutupdate4() {
    }

    public ff_layoutupdate4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        ffl_addr.xdrEncode(xdr);
        ffl_fhandle.xdrEncode(xdr);
        ffl_read.xdrEncode(xdr);
        ffl_write.xdrEncode(xdr);
        ffl_duration.xdrEncode(xdr);
        xdr.xdrEncodeBoolean(ffl_local);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        ffl_addr = new netaddr4(xdr);
        ffl_fhandle = new nfs_fh4(xdr);
        ffl_read = new ff_io_latency4(xdr);
        ffl_write = new ff_io_latency4(xdr);
        ffl_duration = new nfstime4(xdr);
        ffl_local = xdr.xdrDecodeBoolean();
    }

}
// End of ff_layoutupdate4.java
