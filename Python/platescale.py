'''
Program to calculate a plate scale of a Charge-Couple-Device (CCD).
Input: RA/DEC and ROW/COL coordinates in degrees and pixels for 2 diferent sources
Output: plate scale in arcsec/pixel and plate scale in arcsec/mm
'''

import math

RA_1 = 259.166338881534  #RA coord of a first source in degrees
RA_2 = 259.156696323262  #RA coord of a second source in degrees
DEC_1 = -34.6900608909609  #DEC coord of a first source in degrees
DEC_2 = -34.6876379220006  #DEC coord of a second source in degrees
avg_DEC = (DEC_1 + DEC_2)/2
ra = (RA_1 - RA_2)*math.cos(math.radians(avg_DEC))*3600
dec = (DEC_1 - DEC_2)*3600
distance_RADEC = math.sqrt(ra**2 + dec**2) #distance between sources in arcsec

COL_1 = 1295.92  #COL coord of a first source in pixel
COL_2 = 1457.50 #COL coord of a second source in pixel
ROW_1 = 819.69 #ROW coord of a first source in pixel
ROW_2 = 787.51 #ROW coord of a second source in pixel
col = (COL_1 - COL_2)
row = (ROW_1 - ROW_2)
distance_PIXEL = math.sqrt(col**2 + row**2) #distance between sources in pixel

ps = distance_RADEC/distance_PIXEL #platescale in arcsec/pixel
ps_mm = ps/0.0135 #platescale in arcs/mm

print('plate scale:', ps, 'arcs/pixel\n')
print('plate scale:', ps_mm, 'arcs/mm')


