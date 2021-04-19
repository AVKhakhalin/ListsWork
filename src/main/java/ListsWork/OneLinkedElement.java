package ListsWork;

public class OneLinkedElement<T>
{
    public T valueElement;
    public OneLinkedElement<T> linkOnNextElement;

    OneLinkedElement(T _valueElement)
    {
        valueElement = _valueElement;
    }

    public T getValueElement()
    {
        return valueElement;
    }

    public OneLinkedElement<T> getLinkOnNextElement()
    {
        return linkOnNextElement;
    }

    public void setLinkOnNextElement(OneLinkedElement<T> linkOnNextElement)
    {
        this.linkOnNextElement = linkOnNextElement;
    }
}
