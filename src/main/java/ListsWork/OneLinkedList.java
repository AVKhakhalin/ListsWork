package ListsWork;

public class OneLinkedList<T>
{
    private OneLinkedElement<T> startElement;

    public OneLinkedList()
    {
        startElement = null;
    }

    public void add(T newValueElement)
    {
        OneLinkedElement<T> newElement = new OneLinkedElement<>(newValueElement);
        newElement.setLinkOnNextElement(startElement);
        startElement = newElement;
    }

    public void deleteFirst()
    {
        startElement = startElement.getLinkOnNextElement();
    }

    public boolean deleteOnIndex(int posToDel) // Возвращает true - когда удалить элемент получилось; false - когда удалить элемент не получилось
    {
        OneLinkedElement<T> prevElement = startElement;
        if (startElement == null)
        {
            return false;
        }
        OneLinkedElement<T> curDelElement = startElement.linkOnNextElement;

        if (posToDel > 0)
        {
            int counter = 1;
            while (curDelElement != null)
            {
                if (counter == posToDel)
                {
                    prevElement.setLinkOnNextElement(curDelElement.getLinkOnNextElement());
                    return true;
                }
                prevElement = prevElement.getLinkOnNextElement();
                curDelElement = curDelElement.getLinkOnNextElement();
                counter++;
            }
            return true;
        }
        else if (posToDel == 0)
        {
            if (startElement == null)
            {
                return false;
            }
            else
            {
                startElement = startElement.getLinkOnNextElement();
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean deleteOnValue(T elemValueToDel)
    {
        if (startElement.getValueElement().equals(elemValueToDel))
        {
            startElement = startElement.linkOnNextElement;
            return true;
        }

        OneLinkedElement<T> prevElement = startElement;
        if (startElement == null)
        {
            return false;
        }
        OneLinkedElement<T> curDelElement = startElement.linkOnNextElement;

        while((curDelElement != null) && (curDelElement.getValueElement().equals(elemValueToDel) == false))
        {
            if (curDelElement == null)
            {
                return false;
            }
            prevElement = prevElement.getLinkOnNextElement();
            curDelElement = curDelElement.getLinkOnNextElement();
        }

        if ((curDelElement != null) && (curDelElement.getValueElement().equals(elemValueToDel) == true))
        {
            prevElement.setLinkOnNextElement(curDelElement.getLinkOnNextElement());
            return true;
        }

        return false;
    }

    public boolean isEmpty()
    {
        if (startElement != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int searchIndexElement(T elemValueToSearch)
    {
        OneLinkedElement<T> searchElement = startElement;

        int counter = 0;
        while (searchElement != null)
        {
            if (searchElement.getValueElement().equals(elemValueToSearch) == true)
            {
                return counter;
            }
            searchElement = searchElement.linkOnNextElement;
            counter++;
        }

        return -1;
    }

    public boolean searchElement(T elemValueToSearch)
    {
        OneLinkedElement<T> searchElement = startElement;

        while (searchElement != null)
        {
            if (searchElement.getValueElement().equals(elemValueToSearch) == true)
            {
                return true;
            }
            searchElement = searchElement.linkOnNextElement;
        }

        return false;
    }

    public void showElements()
    {
        OneLinkedElement<T> printElement = startElement;
        int counter = 0;
        System.out.print("[");
        while(printElement != null)
        {
            System.out.print(printElement.getValueElement() + (printElement.getLinkOnNextElement() != null ? ", " : ""));
            printElement = printElement.getLinkOnNextElement();
        }
        System.out.print("]");
    }
}
