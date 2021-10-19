from statistics import mean, stdev
from numpy import array, cov
import matplotlib.pyplot as plt

#dados
x = [1.3054072893322786, 1.7434467956210977, 2.3662015831524985, 2.9238044001630863]
y = [0.90, 0.98, 1.07, 1.17]


def linearRegression(x, y):
    #### Least squares method ###
    mediany = mean(y)
    medianx = mean(x)

    sigmax = stdev(x)
    sigmay = stdev(y)

    #transformando as listas em arrays para usar np.cov
    x = array(x) 
    y = array(y)
    covariance = cov(x,y) 

    r = covariance[0][1]/(sigmax*sigmay) #Pearson's linear correction coef. 

    a = r*sigmay/sigmax #angular coef.
    b = mediany - a*medianx #linear coef.

    print('y = {:.3f}x + {:.3}'.format(a,b))
    
    plt.scatter(x,y, label = 'data', color = 'r')    
    plt.plot(x,a*x + b, label = 'fit')
    plt.ylabel('y')
    plt.xlabel('x')
    plt.text(1.5,1.1,'y = {:.3f}x + {:.3}'.format(a,b), fontsize = 14)
    plt.legend()
    plt.savefig('linear-regression.png')
    plt.show()
    return(a, b)

linearRegression(x, y)




