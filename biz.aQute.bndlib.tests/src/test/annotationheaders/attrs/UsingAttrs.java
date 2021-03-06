package test.annotationheaders.attrs;

import aQute.bnd.annotation.headers.RequireCapability;
import test.annotationheaders.attrs.AnnotationWithAttrs.E;

@AnnotationWithAttrs(bar=10, foo={"abc","def"}, en=E.A)
@License(foo="abc")
@ExtendedProvide(foo = 3, bar = 3)
@AnnotationWithValue("hello")
@RequireCapability(ns = "nsz", filter = "(nsz=*)", extra = "hello=world")
public class UsingAttrs {

}
